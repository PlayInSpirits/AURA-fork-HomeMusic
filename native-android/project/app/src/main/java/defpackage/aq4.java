package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class aq4 extends rx1 {
    public final /* synthetic */ int d;

    public /* synthetic */ aq4(s24 r1, int r2) {
        this.d = r2;
        super(r1);
    }

    @Override // defpackage.rx1
    public final String e() {
        switch(this.d) {
            case 0: goto L44;
            case 1: goto L42;
            case 2: goto L40;
            case 3: goto L38;
            case 4: goto L36;
            case 5: goto L34;
            case 6: goto L32;
            case 7: goto L30;
            case 8: goto L28;
            case 9: goto L26;
            case 10: goto L24;
            case 11: goto L22;
            case 12: goto L20;
            case 13: goto L18;
            case 14: goto L16;
            case 15: goto L14;
            case 16: goto L12;
            case 17: goto L10;
            case 18: goto L8;
            case 19: goto L6;
            default: goto L4;
        };
    L4:
        return "DELETE FROM worktag WHERE work_spec_id=?";
    L6:
        return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
    L8:
        return "UPDATE workspec SET last_enqueue_time=? WHERE id=?";
    L10:
        return "UPDATE workspec SET output=? WHERE id=?";
    L12:
        return "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
    L14:
        return "UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?";
    L16:
        return "UPDATE workspec SET state=? WHERE id=?";
    L18:
        return "DELETE FROM workspec WHERE id=?";
    L20:
        return "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`next_schedule_time_override` = ?,`next_schedule_time_override_generation` = ?,`stop_reason` = ?,`trace_tag` = ?,`required_network_type` = ?,`required_network_request` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
    L22:
        return "UPDATE workspec SET stop_reason=? WHERE id=?";
    L24:
        return "UPDATE workspec SET generation=generation+1 WHERE id=?";
    L26:
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    L28:
        return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
    L30:
        return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
    L32:
        return "UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)";
    L34:
        return "UPDATE workspec SET next_schedule_time_override=? WHERE id=?";
    L36:
        return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
    L38:
        return "DELETE FROM WorkProgress";
    L40:
        return "DELETE from WorkProgress where work_spec_id=?";
    L42:
        return "DELETE FROM SystemIdInfo where work_spec_id=?";
    L44:
        return "DELETE FROM SystemIdInfo where work_spec_id=? AND generation=?";
    }
}
