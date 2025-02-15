package com.SpringCore.Collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class FamilyRecords {
private String MemberName;
private List<String> MobileNo;
private Set<String> topenNames;
private Map<String, Integer> Occupations;
private Properties proper;

public FamilyRecords(String memberName, List<String> mobileNo, Set<String> topenNames, Map<String, Integer> occupations,
		Properties proper) {
	super();
	MemberName = memberName;
	MobileNo = mobileNo;
	this.topenNames = topenNames;
	Occupations = occupations;
	this.proper = proper;
}
public Properties getProper() {
	return proper;
}
public void setProper(Properties proper) {
	this.proper = proper;
}
public String getMemberName() {
	return MemberName;
}
public void setMemberName(String memberName) {
	MemberName = memberName;
}
public List<String> getMobileNo() {
	return MobileNo;
}
public void setMobileNo(List<String> mobileNo) {
	MobileNo = mobileNo;
}
public Set<String> getTopenNames() {
	return topenNames;
}
public void setTopenNames(Set<String> topenNames) {
	this.topenNames = topenNames;
}
public Map<String, Integer> getOccupations() {
	return Occupations;
}
public void setOccupations(Map<String, Integer> occupations) {
	Occupations = occupations;
}

public FamilyRecords() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "FamilyRecords [MemberName=" + MemberName + ", MobileNo=" + MobileNo + ", topenNames=" + topenNames
			+ ", Occupations=" + Occupations + ", proper=" + proper + "]";
}


}
