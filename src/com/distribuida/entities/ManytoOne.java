package com.distribuida.entities;

import javax.persistence.CascadeType;

public @interface ManytoOne {

	CascadeType[] cascade();

}
