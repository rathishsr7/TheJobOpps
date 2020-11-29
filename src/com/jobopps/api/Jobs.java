package com.jobopps.api;

import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.*;

import com.jobopps.models.Job;


@Path("/jobs")
public class Jobs {

	@GET
	@Path("/allJobs")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Job> getAllJobs() {
		System.out.println("Get all jobs");
		List<Job> jobs = new ArrayList<Job>();
		Job j1 = new Job();
		j1.jobId = "1";
		j1.jobDescription = "This is a great job, dont miss it.";
		Job j2 = new Job();
		j2.jobId = "2";
		j2.jobDescription = "This is a pretty ok job, dont bother applying it.";
		jobs.add(j1);
		jobs.add(j2);
		return jobs;
	}
	
	@POST
	@Path("/createJob")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public String createJob(Job job) {
		System.out.println("Create job");
		String result = "{message: 'Success',";
		result += "ID:" + job.jobId + "}";
		return result;
	}
}
