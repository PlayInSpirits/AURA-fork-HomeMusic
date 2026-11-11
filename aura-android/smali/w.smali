.class public final Lw;
.super Lep4;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lwf1;


# instance fields
.field public final synthetic o:I

.field public final synthetic p:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Lvd0;I)V
    .locals 0

    .line 1
    iput p3, p0, Lw;->o:I

    .line 2
    .line 3
    iput-object p1, p0, Lw;->p:Ljava/lang/Object;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p2}, Lep4;-><init>(ILvd0;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvd0;)Lvd0;
    .locals 1

    .line 1
    iget p1, p0, Lw;->o:I

    .line 2
    .line 3
    iget-object p0, p0, Lw;->p:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, Lw;

    .line 9
    .line 10
    check-cast p0, Ldd5;

    .line 11
    .line 12
    const/4 v0, 0x2

    .line 13
    invoke-direct {p1, p0, p2, v0}, Lw;-><init>(Ljava/lang/Object;Lvd0;I)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :pswitch_0
    new-instance p1, Lw;

    .line 18
    .line 19
    check-cast p0, Lu30;

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    invoke-direct {p1, p0, p2, v0}, Lw;-><init>(Ljava/lang/Object;Lvd0;I)V

    .line 23
    .line 24
    .line 25
    return-object p1

    .line 26
    :pswitch_1
    new-instance p1, Lw;

    .line 27
    .line 28
    check-cast p0, Lu30;

    .line 29
    .line 30
    const/4 v0, 0x0

    .line 31
    invoke-direct {p1, p0, p2, v0}, Lw;-><init>(Ljava/lang/Object;Lvd0;I)V

    .line 32
    .line 33
    .line 34
    return-object p1

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lw;->o:I

    .line 2
    .line 3
    sget-object v1, Lj15;->a:Lj15;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Ltc0;

    .line 9
    .line 10
    check-cast p2, Lvd0;

    .line 11
    .line 12
    invoke-virtual {p0, p1, p2}, Lw;->create(Ljava/lang/Object;Lvd0;)Lvd0;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lw;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lw;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    return-object v1

    .line 22
    :pswitch_0
    check-cast p1, Lwe0;

    .line 23
    .line 24
    check-cast p2, Lvd0;

    .line 25
    .line 26
    invoke-virtual {p0, p1, p2}, Lw;->create(Ljava/lang/Object;Lvd0;)Lvd0;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    check-cast p0, Lw;

    .line 31
    .line 32
    invoke-virtual {p0, v1}, Lw;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    return-object v1

    .line 36
    :pswitch_1
    check-cast p1, Lwe0;

    .line 37
    .line 38
    check-cast p2, Lvd0;

    .line 39
    .line 40
    invoke-virtual {p0, p1, p2}, Lw;->create(Ljava/lang/Object;Lvd0;)Lvd0;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    check-cast p0, Lw;

    .line 45
    .line 46
    invoke-virtual {p0, v1}, Lw;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    return-object v1

    .line 50
    nop

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lw;->o:I

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    const/4 v2, 0x0

    .line 5
    sget-object v3, Lj15;->a:Lj15;

    .line 6
    .line 7
    iget-object p0, p0, Lw;->p:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-static {p1}, Lkb4;->X(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    sget-object p1, Lic0;->a:Ljava/lang/String;

    .line 16
    .line 17
    check-cast p0, Ldd5;

    .line 18
    .line 19
    invoke-static {}, Lcx;->f()Lcx;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    new-instance v1, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    const-string v2, "Constraints changed for "

    .line 26
    .line 27
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-virtual {v0, p1, p0}, Lcx;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    return-object v3

    .line 41
    :pswitch_0
    invoke-static {p1}, Lkb4;->X(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    check-cast p0, Lu30;

    .line 45
    .line 46
    iget-object p1, p0, Lu30;->N:Lwp1;

    .line 47
    .line 48
    if-eqz p1, :cond_1

    .line 49
    .line 50
    new-instance p1, Lxp1;

    .line 51
    .line 52
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 53
    .line 54
    .line 55
    iget-object v0, p0, Lu30;->D:Lrm2;

    .line 56
    .line 57
    if-eqz v0, :cond_0

    .line 58
    .line 59
    invoke-virtual {p0}, Lcx2;->e0()Lwe0;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    new-instance v5, Lp;

    .line 64
    .line 65
    const/4 v6, 0x1

    .line 66
    invoke-direct {v5, v0, p1, v2, v6}, Lp;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lvd0;I)V

    .line 67
    .line 68
    .line 69
    invoke-static {v4, v2, v2, v5, v1}, Lfu;->G(Lwe0;Lne0;Lze0;Lwf1;I)Lsk4;

    .line 70
    .line 71
    .line 72
    :cond_0
    iput-object v2, p0, Lu30;->N:Lwp1;

    .line 73
    .line 74
    :cond_1
    return-object v3

    .line 75
    :pswitch_1
    invoke-static {p1}, Lkb4;->X(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    check-cast p0, Lu30;

    .line 79
    .line 80
    iget-object p1, p0, Lu30;->N:Lwp1;

    .line 81
    .line 82
    if-nez p1, :cond_3

    .line 83
    .line 84
    new-instance p1, Lwp1;

    .line 85
    .line 86
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 87
    .line 88
    .line 89
    iget-object v0, p0, Lu30;->D:Lrm2;

    .line 90
    .line 91
    if-eqz v0, :cond_2

    .line 92
    .line 93
    invoke-virtual {p0}, Lcx2;->e0()Lwe0;

    .line 94
    .line 95
    .line 96
    move-result-object v4

    .line 97
    new-instance v5, Lp;

    .line 98
    .line 99
    const/4 v6, 0x0

    .line 100
    invoke-direct {v5, v0, p1, v2, v6}, Lp;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lvd0;I)V

    .line 101
    .line 102
    .line 103
    invoke-static {v4, v2, v2, v5, v1}, Lfu;->G(Lwe0;Lne0;Lze0;Lwf1;I)Lsk4;

    .line 104
    .line 105
    .line 106
    :cond_2
    iput-object p1, p0, Lu30;->N:Lwp1;

    .line 107
    .line 108
    :cond_3
    return-object v3

    .line 109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
