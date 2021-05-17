package com.slokam.healthcare.service;

import java.util.List;

public interface IVisitingService {

	abstract public /*List<Object[]>*/List<String> getVisitingsByPatientId(Integer id);
}
