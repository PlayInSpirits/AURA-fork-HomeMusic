.class public final synthetic Ldefpackage/ss3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ldefpackage/vs3;

.field public final synthetic p:Ljava/lang/String;

.field public final synthetic q:J


# direct methods
.method public synthetic constructor <init>(Ldefpackage/vs3;Ljava/lang/String;JI)V
    .locals 0

    .line 1
    iput p5, p0, Ldefpackage/ss3;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Ldefpackage/ss3;->o:Ldefpackage/vs3;

    .line 4
    .line 5
    iput-object p2, p0, Ldefpackage/ss3;->p:Ljava/lang/String;

    .line 6
    .line 7
    iput-wide p3, p0, Ldefpackage/ss3;->q:J

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    iget v0, p0, Ldefpackage/ss3;->n:I

    .line 2
    .line 3
    iget-object v1, p0, Ldefpackage/ss3;->o:Ldefpackage/vs3;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, v1, Ldefpackage/vs3;->a:Ldefpackage/ns3;

    .line 9
    .line 10
    invoke-virtual {v0}, Ldefpackage/ns3;->c()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    new-instance v1, Ldefpackage/bi2;

    .line 19
    .line 20
    const/16 v2, 0x1c

    .line 21
    .line 22
    invoke-direct {v1, v2}, Ldefpackage/bi2;-><init>(I)V

    .line 23
    .line 24
    .line 25
    invoke-interface {v0, v1}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-interface {v0, v1}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    check-cast v0, Ljava/util/List;

    .line 38
    .line 39
    iget-object v1, p0, Ldefpackage/ss3;->p:Ljava/lang/String;

    .line 40
    .line 41
    iget-wide v2, p0, Ldefpackage/ss3;->q:J

    .line 42
    .line 43
    invoke-static {v0, v1, v2, v3}, Ldefpackage/vs3;->d(Ljava/util/List;Ljava/lang/String;J)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :pswitch_0
    iget-object v0, v1, Ldefpackage/vs3;->a:Ldefpackage/ns3;

    .line 48
    .line 49
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 50
    .line 51
    .line 52
    move-result-wide v2

    .line 53
    iget-object v0, v0, Ldefpackage/ns3;->o:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v0, Ldefpackage/s24;

    .line 56
    .line 57
    new-instance v1, Ldefpackage/js3;

    .line 58
    .line 59
    iget-wide v4, p0, Ldefpackage/ss3;->q:J

    .line 60
    .line 61
    iget-object v6, p0, Ldefpackage/ss3;->p:Ljava/lang/String;

    .line 62
    .line 63
    invoke-direct/range {v1 .. v6}, Ldefpackage/js3;-><init>(JJLjava/lang/String;)V

    .line 64
    .line 65
    .line 66
    const/4 p0, 0x0

    .line 67
    const/4 v2, 0x1

    .line 68
    invoke-static {v0, p0, v2, v1}, Ldefpackage/xl;->E(Ldefpackage/s24;ZZLdefpackage/if1;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    nop

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
