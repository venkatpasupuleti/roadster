package com.roadster.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.roadster.config.Preferences;

@RestController
public class PreferencesController {
	@Autowired
	private Preferences preferences;

	@GetMapping(value="/preferences",produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public Preferences showPreferences() {
		//model.addAttribute("preferences", preferences);
		return preferences;
	}
}
