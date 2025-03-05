package com.jsp.controller;

import java.io.IOException;
import javax.servlet.*;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.jsp.dto.LandLord;
import com.jsp.service.LandlordService;

@WebServlet("/addhotelbylandlord")
public class AddHotelByLandlord extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private LandlordService landlordService = new LandlordService(); // Service initialized once

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            int hotelId = Integer.parseInt(req.getParameter("hotelId"));
            int landlordId = Integer.parseInt(req.getParameter("landlordId")); 
            
            LandLord landLord = new LandLord();
            landLord.setId(landlordId);

            boolean isAdded = landlordService.addHotelById(hotelId, landLord);
            
            if (isAdded) {
                req.setAttribute("message", "Hotel successfully added!");
            } else {
                req.setAttribute("message", "Failed to add hotel. Please try again.");
            }
            
            req.getRequestDispatcher("LandLordOnly.jsp").forward(req, resp);
            
        } catch (NumberFormatException e) {
            req.setAttribute("error", "Invalid input. Please enter valid numbers.");
            req.getRequestDispatcher("error.jsp").forward(req, resp);
        } catch (Exception e) {
            req.setAttribute("error", "Something went wrong. Please try again.");
            req.getRequestDispatcher("error.jsp").forward(req, resp);
        }
    }
}
