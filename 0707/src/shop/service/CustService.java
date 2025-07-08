package shop.service;

import shop.dto.CustDto;
import shop.repository.CustMySQLRepository;
import shop.repository.SMRepository;

import java.util.List;

public class CustService implements SMService<CustDto,String> {

    SMRepository<CustDto, String> smRepository;
    public CustService(){
        // smRepository = new CustOlacleRepository();
        smRepository = new CustMySQLRepository();
    }

    @Override
    public void register(CustDto custDto) {
        System.out.println("CustService: 기본정보 저장");
        smRepository.insert(custDto);
        System.out.println("CustService: SMS 전송");
        System.out.println("CustService: EMAIL 전송");
        System.out.println("CustService: 회원가입 완료");

    }

    @Override
    public void modify(CustDto custDto) {
        System.out.println("CustService: 기본정보 수정");
        smRepository.update(custDto);
        System.out.println("CustService: SMS 전송");
        System.out.println("CustService: 회원정보 수정 완료");
    }

    @Override
    public void remove(String s) {
        System.out.println("CustService: 기본정보 삭제");
        smRepository.delete(s);
        System.out.println("CustService: SMS 전송");
        System.out.println("CustService: 회원정보 삭제 완료");
    }

    @Override
    public List<CustDto> get() {
        List<CustDto> custs = smRepository.selectAll();
        return custs;
    }


    @Override
    public CustDto get(String s) {
        CustDto custDto = null;
        custDto = smRepository.select(s);
        return custDto;
    }
}
