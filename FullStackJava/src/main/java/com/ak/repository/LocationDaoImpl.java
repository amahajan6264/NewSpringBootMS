package com.ak.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class LocationDaoImpl {

	private static final Logger log=LoggerFactory.getLogger(LocationDaoImpl.class);
	
	@Value(value = "${loc.country}")
	private String country;
	@Value(value = "${loc.state}")
	private String state;
	@Value(value = "${loc.city}")
	private String city;
	@Value(value = "${loc.village}")
	private String village;

	@Autowired
	private DataSource ds;

	public Map<Integer, String> getCountry() {
		Map<Integer, String> countryMap = new LinkedHashMap<>();
		try (Connection con = ds.getConnection();
				PreparedStatement pstmt = con.prepareStatement(country);
				ResultSet rs = pstmt.executeQuery()) {

			while (rs.next()) {
				countryMap.put(rs.getInt(1), rs.getString(2));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return countryMap;
	}

	public Map<Integer, String> getState(Integer id) {
		Map<Integer, String> countryMap = new LinkedHashMap<>();
		try (Connection con = ds.getConnection(); PreparedStatement pstmt = con.prepareStatement(state)) {

			pstmt.setInt(1, id);

			try (ResultSet rs = pstmt.executeQuery()) {
				while (rs.next()) {
					countryMap.put(rs.getInt(1), rs.getString(2));
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return countryMap;
	}

	public Map<Integer, String> getCity(Integer id) {
		log.debug("city");
		log.error("city");
		log.trace("city");
		log.info("city");
		Map<Integer, String> countryMap = new LinkedHashMap<>();
		try (Connection con = ds.getConnection();
			     PreparedStatement pstmt = con.prepareStatement(city)) {

			    pstmt.setInt(1, id);

			    try (ResultSet rs = pstmt.executeQuery()) {
			        while (rs.next()) {
			            countryMap.put(rs.getInt(1), rs.getString(2));
			        }
			    }

			} catch (SQLException e) {
			    e.printStackTrace();
			}
		return countryMap;
	}

	public Map<Integer, String> getVillage(Integer id) {
		Map<Integer, String> countryMap = new LinkedHashMap<>();
		try (Connection con = ds.getConnection(); PreparedStatement pstmt = con.prepareStatement(village)) {

			pstmt.setInt(1, id);

			try (ResultSet rs = pstmt.executeQuery()) {
				while (rs.next()) {
					countryMap.put(rs.getInt(1), rs.getString(2));
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return countryMap;
	}
}
