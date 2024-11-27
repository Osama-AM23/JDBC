package com.xworkz.camera.runner;

import java.util.List;
import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.camera.dto.CameraDto;

public class CameraRunner {

	public static void main(String[] args) {
		
		EntityManagerFactory emFactory =Persistence.createEntityManagerFactory("camera");
		EntityManager eManager=emFactory.createEntityManager();
		EntityTransaction eTrans=eManager.getTransaction();
		
		List<CameraDto> list= new ArrayList<>();
		list.add(new CameraDto("Canon EOS 5D Mark IV", "EOS 5D Mark IV", 50000, "DSLR", 30.4, 3.2, 900, 890, 2));
        list.add(new CameraDto("Nikon D850", "D850", 49499, "DSLR", 45.7, 3.2, 1084, 1005, 2));
        list.add(new CameraDto("Sony Alpha 7 III", "ILCE-7M3", 1999.99, "Mirrorless", 24.2, 3.0, 710, 650, 1));
        list.add(new CameraDto("Panasonic Lumix GH5", "DC-GH5", 1299.99, "Mirrorless", 20.3, 3.2, 410, 725, 2));
        list.add(new CameraDto("Fujifilm X-T4", "X-T4", 1699.99, "Mirrorless", 26.1, 3.0, 600, 607, 1));
        list.add(new CameraDto("Olympus OM-D E-M1 Mark III", "E-M1 Mark III", 1799.99, "Mirrorless", 20.4, 3.0, 420, 500, 1));
        list.add(new CameraDto("Leica Q2", "Q2", 4995.00, "Compact", 47.3, 3.0, 350, 734, 2));
        list.add(new CameraDto("Canon PowerShot G7 X Mark III", "G7 X Mark III", 749.99, "Compact", 20.1, 3.0, 265, 304, 1));
        list.add(new CameraDto("Nikon Z50", "Z50", 859.99, "Mirrorless", 20.9, 3.2, 280, 395, 2));
        list.add(new CameraDto("GoPro HERO10 Black", "HERO10 Black", 499.99, "Action Camera", 23.6, 2.27, 180, 153, 1));
        
        for (CameraDto camera : list) {
            CameraDto dto= new CameraDto();
            dto.setCameraName(camera.getCameraName());
            dto.setModel(camera.getModel());
            dto.setPrice(camera.getPrice());
            dto.setType(camera.getType());
            dto.setResolution(camera.getResolution());
            dto.setScreenSize(camera.getScreenSize());
            dto.setBatteryLife(camera.getBatteryLife());
            dto.setWeight(camera.getWeight());
            dto.setWarranty(camera.getWarranty());
            
        }

		
		try {
			
			eTrans.begin();
			for(CameraDto camera: list) {
				eManager.persist(camera);
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
