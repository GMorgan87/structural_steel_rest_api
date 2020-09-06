package com.gmorgan.framedesigner.repositories;

import com.gmorgan.framedesigner.Models.Section;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SectionRepository extends JpaRepository<Section, Long> {

    List<Section> findAllByDescContainsOrderByIxx (String string);
    List<Section> findAllByIyyGreaterThanAndZyyGreaterThanAndDescContainsIgnoreCase(double iyy, double zyy, String desc);
    List<Section> findAllByIxxGreaterThanAndZxxGreaterThanAndIyyGreaterThanAndZyyGreaterThanAndDescContainsIgnoreCase(double ixx, double zxx, double iyy, double zyy, String desc);
    Section findFirstByIyyGreaterThanAndZyyGreaterThanAndCsaGreaterThanAndDescContainsIgnoreCase(double iyy, double zyy, double csa, String desc);
    Section findFirstByIyyGreaterThanAndZyyGreaterThanAndXGreaterThanAndYGreaterThanAndDescContainsIgnoreCase(double iyy, double zyy, int x, int y, String desc);
}
