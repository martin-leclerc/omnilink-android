package net.homeip.mleclerc.omnilinkanclient.model.soap.stubs;

import java.util.Hashtable;

import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class SetUnitControl implements KvmSerializable {
	public int arg0;
	public UnitControl arg1;

	public SetUnitControl() {
	}

	public SetUnitControl(SoapObject soapObject) {
		if (soapObject.hasProperty("arg0")) {
			Object obj = soapObject.getProperty("arg0");
			if (obj.getClass().equals(SoapPrimitive.class)) {
				SoapPrimitive j22 = (SoapPrimitive) soapObject.getProperty("arg0");
				arg0 = Integer.parseInt(j22.toString());
			}
		}
		if (soapObject.hasProperty("arg1")) {
			Object obj = soapObject.getProperty("arg1");
			if (obj.getClass().equals(SoapPrimitive.class)) {
				SoapPrimitive j23 = (SoapPrimitive) soapObject.getProperty("arg1");
				arg1 = UnitControl.fromString(j23.toString());
			}
		}
	}

	@Override
	public Object getProperty(int arg0) {
		switch (arg0) {
		case 0:
			return this.arg0;
		case 1:
			return arg1.toString();
		}
		return null;
	}

	@Override
	public int getPropertyCount() {
		return 2;
	}

	@Override
	public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
		switch (index) {
		case 0:
			info.type = PropertyInfo.INTEGER_CLASS;
			info.name = "arg0";
			break;
		case 1:
			info.type = PropertyInfo.STRING_CLASS;
			info.name = "arg1";
			break;
		}
	}

	@Override
	public void setProperty(int index, Object value) {
		switch (index) {
		case 0:
			arg0 = Integer.parseInt(value.toString());
			break;
		case 1:
			arg1 = UnitControl.fromString(value.toString());
			break;
		}
	}
}
