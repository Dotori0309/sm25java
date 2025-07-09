package eud.sm.dto;

import lombok.*;

import java.sql.Timestamp;
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Builder
public class Cust {
    private String custId;
    private String custPwd;
    private String custName;
    private Timestamp custRegdate;
    private Timestamp custUpdate;
}