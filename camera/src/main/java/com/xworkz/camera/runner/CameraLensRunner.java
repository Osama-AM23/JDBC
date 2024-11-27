package com.xworkz.camera.runner;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.camera.dto.CameraLensDto;

public class CameraLensRunner {

	public static void main(String[] args) {

		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("camera");
		EntityManager eManager = emFactory.createEntityManager();
		EntityTransaction eTrans = eManager.getTransaction();

		List<CameraLensDto> list = new ArrayList<CameraLensDto>();
		list.add(new CameraLensDto("Canon EF 50mm f/1.8 STM", "Prime", "50mm", "f/1.8", "f/1.8", "Canon EF", "49mm",
				160));
		list.add(new CameraLensDto("Nikon AF-S Nikkor 24-70mm f/2.8E ED VR", "Zoom", "24-70mm", "f/2.8", "f/2.8",
				"Nikon F", "77mm", 1000));
		list.add(new CameraLensDto("Sony FE 70-200mm f/2.8 GM OSS", "Zoom", "70-200mm", "f/2.8", "f/2.8", "Sony E",
				"77mm", 1480));
		list.add(new CameraLensDto("Sigma 18-35mm f/1.8 DC HSM Art", "Zoom", "18-35mm", "f/1.8", "f/1.8", "Canon EF",
				"72mm", 810));
		list.add(new CameraLensDto("Tamron SP 90mm f/2.8 Di VC USD Macro", "Macro", "90mm", "f/2.8", "f/2.8",
				"Canon EF", "62mm", 550));
		list.add(new CameraLensDto("Canon RF 50mm f/1.2L USM", "Prime", "50mm", "f/1.2", "f/1.2", "Canon RF", "77mm",
				950));
		list.add(new CameraLensDto("Nikon AF-S Nikkor 14-24mm f/2.8G ED", "Zoom", "14-24mm", "f/2.8", "f/2.8",
				"Nikon F", "82mm", 1000));
		list.add(new CameraLensDto("Fujifilm XF 23mm f/1.4 R", "Prime", "23mm", "f/1.4", "f/1.4", "Fujifilm X", "52mm",
				300));
		list.add(new CameraLensDto("Olympus M.Zuiko Digital ED 12-40mm f/2.8 PRO", "Zoom", "12-40mm", "f/2.8", "f/2.8",
				"Micro Four Thirds", "62mm", 382));
		list.add(new CameraLensDto("Leica Summilux-M 50mm f/1.4 ASPH", "Prime", "50mm", "f/1.4", "f/1.4", "Leica M",
				"46mm", 335));

		for (CameraLensDto lens : list) {
			CameraLensDto lensDto = new CameraLensDto();
			
			lensDto.setLensName(lens.getLensName());
			lensDto.setLensType(lens.getLensType());
			lensDto.setFocalLength(lens.getFocalLength());
			lensDto.setAperture(lens.getAperture());
			lensDto.setMaxAperture(lens.getMaxAperture());
			lensDto.setLensMount(lens.getLensMount());
			lensDto.setFilterSize(lens.getFilterSize());
			lensDto.setWeight(lens.getWeight());
		}
		
		try {
			
			eTrans.begin();
			
			for(CameraLensDto lens :list) {
				eManager.persist(lens);
			}
			eTrans.commit();
			
		} catch (Exception e) {
			if(eTrans.isActive()) {
				eTrans.rollback();
			}
			e.printStackTrace();
		}finally {
			eManager.close();
			emFactory.close();
		}
	}

}
