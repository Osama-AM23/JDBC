package com.xworkz.fitness.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "workouts_table")

@NamedQuery(name = "getAll", query = "Select fe from FitnessEntity fe")

@NamedQuery(name = "getUserIdAndWorkoutTypeById", query = "Select fe.userId, fe.workoutType from FitnessEntity fe where fe.id= :setId")

@NamedQuery(name = "getCountByDistance", query = "Select count(fe) from FitnessEntity fe where fe.distance> :dist")

@NamedQuery(name = "getCountByWorkoutType&HeartRate", query = "Select count(fe) from FitnessEntity fe Where fe.workoutType= :workoutType And fe.avgHeartRate= :heartRate")

@NamedQuery(name = "getSingleRow", query = "Select fe From FitnessEntity fe where fe.id= :id")

@NamedQuery(name = "getAllByUserIdAndSteps", query = "Select fe From FitnessEntity fe where fe.userId= :user and fe.steps= :stp")

@NamedQuery(name = "update", query = "update FitnessEntity fe Set fe.duration= :duration Where fe.id= :id And fe.caloriesBurned= :calo")

@NamedQuery(name = "updateByIsCompletedAndUserId", query = "update FitnessEntity fe Set fe.workoutType= :workoutType Where fe.isCompleted= :complete And fe.userId= :user")

@NamedQuery(name = "delete", query = "delete From FitnessEntity fe Where fe.id= :setId And fe.caloriesBurned= :calo")

public class FitnessEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "user_id")
	private int userId;

	@Column(name = "workout_date")
	private LocalDate workoutDate;

	@Column(name = "workout_type")
	private String workoutType;

	@Column(name = "duration")
	private int duration;

	@Column(name = "calories_burned")
	private int caloriesBurned;

	@Column(name = "distance")
	private double distance;

	@Column(name = "heart_rate")
	private int avgHeartRate;

	@Column(name = "steps")
	private int steps;

	@Column(name = "is_complete")
	private boolean isCompleted;

	public FitnessEntity() {

	}

	public FitnessEntity(int userId, LocalDate workoutDate, String workoutType, int duration, int caloriesBurned,
			double distance, int avgHeartRate, int steps, boolean isCompleted) {
		super();
		this.userId = userId;
		this.workoutDate = workoutDate;
		this.workoutType = workoutType;
		this.duration = duration;
		this.caloriesBurned = caloriesBurned;
		this.distance = distance;
		this.avgHeartRate = avgHeartRate;
		this.steps = steps;
		this.isCompleted = isCompleted;
	}

	@Override
	public String toString() {
		return "FitnessEntity [id=" + id + ", userId=" + userId + ", workoutDate=" + workoutDate + ", workoutType="
				+ workoutType + ", duration=" + duration + ", caloriesBurned=" + caloriesBurned + ", distance="
				+ distance + ", avgHeartRate=" + avgHeartRate + ", steps=" + steps + ", isCompleted=" + isCompleted
				+ "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public LocalDate getWorkoutDate() {
		return workoutDate;
	}

	public void setWorkoutDate(LocalDate workoutDate) {
		this.workoutDate = workoutDate;
	}

	public String getWorkoutType() {
		return workoutType;
	}

	public void setWorkoutType(String workoutType) {
		this.workoutType = workoutType;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getCaloriesBurned() {
		return caloriesBurned;
	}

	public void setCaloriesBurned(int caloriesBurned) {
		this.caloriesBurned = caloriesBurned;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public int getAvgHeartRate() {
		return avgHeartRate;
	}

	public void setAvgHeartRate(int avgHeartRate) {
		this.avgHeartRate = avgHeartRate;
	}

	public int getSteps() {
		return steps;
	}

	public void setSteps(int steps) {
		this.steps = steps;
	}

	public boolean isCompleted() {
		return isCompleted;
	}

	public void setCompleted(boolean isCompleted) {
		this.isCompleted = isCompleted;
	}

}
