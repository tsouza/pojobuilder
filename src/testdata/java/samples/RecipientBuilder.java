package samples;

import javax.annotation.Generated;

@Generated("PojoBuilder")
public class RecipientBuilder
    implements Builder<Recipient>, Cloneable {
  protected RecipientBuilder self;
  protected String value$name$java$lang$String;
  protected boolean isSet$name$java$lang$String;
  protected Builder<String> builder$name$java$lang$String;
  protected Address value$address$samples$Address;
  protected boolean isSet$address$samples$Address;
  protected Builder<Address> builder$address$samples$Address;

  /**
   * Creates a new {@link RecipientBuilder}.
   */
  public RecipientBuilder() {
    self = (RecipientBuilder)this;
  }

  /**
   * Sets the default value for the {@link Recipient#name} property.
   *
   * @param value the default value
   * @return this builder
   */
  public RecipientBuilder withName(String value) {
    this.value$name$java$lang$String = value;
    this.isSet$name$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default builder for the {@link Recipient#name} property.
   *
   * @param builder the default builder
   * @return this builder
   */
  public RecipientBuilder withName(Builder<String> builder) {
    this.builder$name$java$lang$String = builder;
    this.isSet$name$java$lang$String = false;
    return self;
  }

  /**
   * Sets the default value for the {@link Recipient#address} property.
   *
   * @param value the default value
   * @return this builder
   */
  public RecipientBuilder withAddress(Address value) {
    this.value$address$samples$Address = value;
    this.isSet$address$samples$Address = true;
    return self;
  }

  /**
   * Sets the default builder for the {@link Recipient#address} property.
   *
   * @param builder the default builder
   * @return this builder
   */
  public RecipientBuilder withAddress(Builder<Address> builder) {
    this.builder$address$samples$Address = builder;
    this.isSet$address$samples$Address = false;
    return self;
  }

  /**
   * Returns a clone of this builder.
   *
   * @return the clone
   */
  @Override
  public Object clone() {
    try {
      RecipientBuilder result = (RecipientBuilder)super.clone();
      result.self = result;
      return result;
    } catch (CloneNotSupportedException e) {
      throw new InternalError(e.getMessage());
    }
  }

  /**
   * Returns a clone of this builder.
   *
   * @return the clone
   */
  public RecipientBuilder but() {
    return (RecipientBuilder)clone();
  }

  /**
   * Creates a new {@link Recipient} based on this builder's settings.
   *
   * @return the created Recipient
   */
  @Override
  public Recipient build() {
    try {
      Recipient result = new Recipient();
      if (isSet$name$java$lang$String) {
        result.setName(value$name$java$lang$String);
      } else if (builder$name$java$lang$String!=null) {
        result.setName(builder$name$java$lang$String.build());
      }
      if (isSet$address$samples$Address) {
        result.setAddress(value$address$samples$Address);
      } else if (builder$address$samples$Address!=null) {
        result.setAddress(builder$address$samples$Address.build());
      }
      return result;
    } catch (RuntimeException ex) {
      throw ex;
    } catch (Throwable t) {
      throw new java.lang.reflect.UndeclaredThrowableException(t);
    }
  }
}
