.class public final Le73;
.super Lep4;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lwf1;


# instance fields
.field public final synthetic o:I

.field public synthetic p:Ljava/lang/Object;

.field public final synthetic q:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lb13;Lb13;Lvd0;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Le73;->o:I

    .line 3
    .line 4
    iput-object p1, p0, Le73;->p:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Le73;->q:Ljava/lang/Object;

    .line 7
    .line 8
    const/4 p1, 0x2

    .line 9
    invoke-direct {p0, p1, p3}, Lep4;-><init>(ILvd0;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(Lwf1;Lvd0;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Le73;->o:I

    .line 13
    iput-object p1, p0, Le73;->q:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lep4;-><init>(ILvd0;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvd0;)Lvd0;
    .locals 2

    .line 1
    iget v0, p0, Le73;->o:I

    .line 2
    .line 3
    iget-object v1, p0, Le73;->q:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p0, Le73;

    .line 9
    .line 10
    check-cast v1, Lwf1;

    .line 11
    .line 12
    invoke-direct {p0, v1, p2}, Le73;-><init>(Lwf1;Lvd0;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Le73;->p:Ljava/lang/Object;

    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_0
    new-instance p1, Le73;

    .line 19
    .line 20
    iget-object p0, p0, Le73;->p:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p0, Lb13;

    .line 23
    .line 24
    check-cast v1, Lb13;

    .line 25
    .line 26
    invoke-direct {p1, p0, v1, p2}, Le73;-><init>(Lb13;Lb13;Lvd0;)V

    .line 27
    .line 28
    .line 29
    return-object p1

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Le73;->o:I

    .line 2
    .line 3
    sget-object v1, Lj15;->a:Lj15;

    .line 4
    .line 5
    check-cast p1, Lwe0;

    .line 6
    .line 7
    check-cast p2, Lvd0;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p1, p2}, Le73;->create(Ljava/lang/Object;Lvd0;)Lvd0;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Le73;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Le73;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Le73;->create(Ljava/lang/Object;Lvd0;)Lvd0;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Le73;

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Le73;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    return-object v1

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Le73;->o:I

    .line 2
    .line 3
    iget-object v1, p0, Le73;->q:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, Lkb4;->X(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Le73;->p:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Lwe0;

    .line 14
    .line 15
    invoke-interface {p0}, Lwe0;->e()Lne0;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    sget-object p1, Lfz0;->R:Lfz0;

    .line 20
    .line 21
    invoke-interface {p0, p1}, Lne0;->K(Lme0;)Lle0;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    check-cast p0, Lpe0;

    .line 29
    .line 30
    new-instance v0, Lx60;

    .line 31
    .line 32
    const/4 v2, 0x1

    .line 33
    invoke-direct {v0, v2}, La32;-><init>(Z)V

    .line 34
    .line 35
    .line 36
    const/4 v3, 0x0

    .line 37
    invoke-virtual {v0, v3}, La32;->N(Ls22;)V

    .line 38
    .line 39
    .line 40
    new-instance v4, Lr;

    .line 41
    .line 42
    check-cast v1, Lwf1;

    .line 43
    .line 44
    const/16 v5, 0xb

    .line 45
    .line 46
    invoke-direct {v4, v0, v1, v3, v5}, Lr;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lvd0;I)V

    .line 47
    .line 48
    .line 49
    sget-object v1, Lq01;->n:Lq01;

    .line 50
    .line 51
    invoke-static {v1, p0, v2}, Ljz4;->t(Lne0;Lne0;Z)Lne0;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    sget-object v5, Lrr0;->a:Lrm0;

    .line 56
    .line 57
    if-eq v1, v5, :cond_0

    .line 58
    .line 59
    invoke-interface {v1, p1}, Lne0;->K(Lme0;)Lle0;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    if-nez p1, :cond_0

    .line 64
    .line 65
    invoke-interface {v1, v5}, Lne0;->J(Lne0;)Lne0;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    :cond_0
    new-instance p1, Lsk4;

    .line 70
    .line 71
    invoke-direct {p1, v1, v2}, Lc0;-><init>(Lne0;Z)V

    .line 72
    .line 73
    .line 74
    sget-object v1, Lze0;->q:Lze0;

    .line 75
    .line 76
    invoke-virtual {p1, v1, p1, v4}, Lc0;->l0(Lze0;Lc0;Lwf1;)V

    .line 77
    .line 78
    .line 79
    :catch_0
    invoke-virtual {v0}, La32;->H()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    instance-of p1, p1, Lmx1;

    .line 84
    .line 85
    if-eqz p1, :cond_1

    .line 86
    .line 87
    :try_start_0
    new-instance p1, Lac0;

    .line 88
    .line 89
    const/4 v1, 0x6

    .line 90
    invoke-direct {p1, v0, v3, v1}, Lac0;-><init>(Ljava/lang/Object;Lvd0;I)V

    .line 91
    .line 92
    .line 93
    invoke-static {p0, p1}, Lfu;->L(Lne0;Lwf1;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v3
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 97
    goto :goto_0

    .line 98
    :cond_1
    invoke-virtual {v0}, La32;->H()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    instance-of p1, p0, Lmx1;

    .line 103
    .line 104
    if-nez p1, :cond_3

    .line 105
    .line 106
    instance-of p1, p0, La70;

    .line 107
    .line 108
    if-nez p1, :cond_2

    .line 109
    .line 110
    invoke-static {p0}, Lzz1;->M(Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    goto :goto_0

    .line 115
    :cond_2
    check-cast p0, La70;

    .line 116
    .line 117
    iget-object p0, p0, La70;->a:Ljava/lang/Throwable;

    .line 118
    .line 119
    throw p0

    .line 120
    :cond_3
    const-string p0, "This job has not completed yet"

    .line 121
    .line 122
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    :goto_0
    return-object v3

    .line 126
    :pswitch_0
    invoke-static {p1}, Lkb4;->X(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    iget-object p0, p0, Le73;->p:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast p0, Lb13;

    .line 132
    .line 133
    invoke-interface {p0}, Lkl4;->getValue()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    check-cast p0, Ljava/lang/Boolean;

    .line 138
    .line 139
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 140
    .line 141
    .line 142
    move-result p0

    .line 143
    if-eqz p0, :cond_4

    .line 144
    .line 145
    check-cast v1, Lb13;

    .line 146
    .line 147
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 148
    .line 149
    invoke-interface {v1, p0}, Lb13;->setValue(Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    :cond_4
    sget-object p0, Lj15;->a:Lj15;

    .line 153
    .line 154
    return-object p0

    .line 155
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
