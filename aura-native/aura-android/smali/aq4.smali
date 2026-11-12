.class public final Laq4;
.super Lrx1;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(Ls24;I)V
    .locals 0

    .line 1
    iput p2, p0, Laq4;->d:I

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lrx1;-><init>(Ls24;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final e()Ljava/lang/String;
    .locals 0

    .line 1
    iget p0, p0, Laq4;->d:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string p0, "DELETE FROM worktag WHERE work_spec_id=?"

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    const-string p0, "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?"

    .line 10
    .line 11
    return-object p0

    .line 12
    :pswitch_1
    const-string p0, "UPDATE workspec SET last_enqueue_time=? WHERE id=?"

    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_2
    const-string p0, "UPDATE workspec SET output=? WHERE id=?"

    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_3
    const-string p0, "UPDATE workspec SET period_count=period_count+1 WHERE id=?"

    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_4
    const-string p0, "UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?"

    .line 22
    .line 23
    return-object p0

    .line 24
    :pswitch_5
    const-string p0, "UPDATE workspec SET state=? WHERE id=?"

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_6
    const-string p0, "DELETE FROM workspec WHERE id=?"

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_7
    const-string p0, "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`next_schedule_time_override` = ?,`next_schedule_time_override_generation` = ?,`stop_reason` = ?,`trace_tag` = ?,`required_network_type` = ?,`required_network_request` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?"

    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_8
    const-string p0, "UPDATE workspec SET stop_reason=? WHERE id=?"

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_9
    const-string p0, "UPDATE workspec SET generation=generation+1 WHERE id=?"

    .line 37
    .line 38
    return-object p0

    .line 39
    :pswitch_a
    const-string p0, "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))"

    .line 40
    .line 41
    return-object p0

    .line 42
    :pswitch_b
    const-string p0, "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)"

    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_c
    const-string p0, "UPDATE workspec SET schedule_requested_at=? WHERE id=?"

    .line 46
    .line 47
    return-object p0

    .line 48
    :pswitch_d
    const-string p0, "UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)"

    .line 49
    .line 50
    return-object p0

    .line 51
    :pswitch_e
    const-string p0, "UPDATE workspec SET next_schedule_time_override=? WHERE id=?"

    .line 52
    .line 53
    return-object p0

    .line 54
    :pswitch_f
    const-string p0, "UPDATE workspec SET run_attempt_count=0 WHERE id=?"

    .line 55
    .line 56
    return-object p0

    .line 57
    :pswitch_10
    const-string p0, "DELETE FROM WorkProgress"

    .line 58
    .line 59
    return-object p0

    .line 60
    :pswitch_11
    const-string p0, "DELETE from WorkProgress where work_spec_id=?"

    .line 61
    .line 62
    return-object p0

    .line 63
    :pswitch_12
    const-string p0, "DELETE FROM SystemIdInfo where work_spec_id=?"

    .line 64
    .line 65
    return-object p0

    .line 66
    :pswitch_13
    const-string p0, "DELETE FROM SystemIdInfo where work_spec_id=? AND generation=?"

    .line 67
    .line 68
    return-object p0

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
