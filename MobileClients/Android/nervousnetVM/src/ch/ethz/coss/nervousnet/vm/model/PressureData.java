package ch.ethz.coss.nervousnet.vm.model;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table "PRESSURE_DATA".
 */
public class PressureData implements SensorDataImpl {
	private Integer Type = 0;
    private long TimeStamp;
    private Float Pressure;
    private long Volatility;
    private Boolean ShareFlag;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public PressureData() {
    }

    public PressureData(long TimeStamp) {
        this.TimeStamp = TimeStamp;
    }

    public PressureData(long TimeStamp, Float Pressure, long Volatility, Boolean ShareFlag) {
        this.TimeStamp = TimeStamp;
        this.Pressure = Pressure;
        this.Volatility = Volatility;
        this.ShareFlag = ShareFlag;
    }

    public long getTimeStamp() {
        return TimeStamp;
    }

    public void setTimeStamp(long TimeStamp) {
        this.TimeStamp = TimeStamp;
    }

    public Float getPressure() {
        return Pressure;
    }

    public void setPressure(Float Pressure) {
        this.Pressure = Pressure;
    }

    public long getVolatility() {
        return Volatility;
    }

    public void setVolatility(long Volatility) {
        this.Volatility = Volatility;
    }

    public Boolean getShareFlag() {
        return ShareFlag;
    }

    public void setShareFlag(Boolean ShareFlag) {
        this.ShareFlag = ShareFlag;
    }

    // KEEP METHODS - put your custom methods here
	@Override
	  public Integer getType() {
      return Type;
  }
	
	@Override
  public void setType(Integer Type) {
      this.Type = Type;
  }
    // KEEP METHODS END

}
