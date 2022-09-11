package services;

import com.example.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner,Long> {

    Owner findBylastName(String lastName);

}
