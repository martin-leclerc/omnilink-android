package net.homeip.mleclerc.omnilinkanclient.model.soap.stubs;

import java.util.Hashtable;

import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

public class SetThermostatSystemMode implements KvmSerializable {
	public SystemMode arg0;

	public SetThermostatSystemMode() {
	}

	public SetThermostatSystemMode(SoapObject soapObject) {
		if (soapObject.hasProperty("arg0")) {
			Object obj = soapObject.getProperty("arg0");
			if (obj.getClass().equals(SoapPrimitive.class)) {
				SoapPrimitive j26 = (SoapPrimitive) soapObject.getProperty("arg0");
				arg0 = SystemMode.fromString(j26.toString());
			}
		}
	}

	@Override
	public Object getProperty(int arg0) {
		switch (arg0) {
		case 0:
			return this.arg0.toString();
		}
		return null;
	}

	@Override
	public int getPropertyCount() {
		return 1;
	}

	@Override
	public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
		switch (index) {
		case 0:
			info.type = PropertyInfo.STRING_CLASS;
			info.name = "arg0";
			break;
		}
	}

	@Override
	public void setProperty(int index, Object value) {
		switch (index) {
		case 0:
			arg0 = SystemMode.fromString(value.toString());
			break;
		}
	}
}
