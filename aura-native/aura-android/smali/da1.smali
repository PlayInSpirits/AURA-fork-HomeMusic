.class public final synthetic Lda1;
.super Lig1;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lwf1;


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    check-cast p1, Lz91;

    .line 2
    .line 3
    check-cast p2, Lz91;

    .line 4
    .line 5
    iget-object p0, p0, Ljy;->receiver:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Lea1;

    .line 8
    .line 9
    iget-boolean v0, p0, Lcx2;->A:Z

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto/16 :goto_2

    .line 14
    .line 15
    :cond_0
    invoke-virtual {p2}, Lz91;->a()Z

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    invoke-virtual {p1}, Lz91;->a()Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-ne p2, p1, :cond_1

    .line 24
    .line 25
    goto/16 :goto_2

    .line 26
    .line 27
    :cond_1
    iget-object p1, p0, Lea1;->E:Lq;

    .line 28
    .line 29
    if-eqz p1, :cond_2

    .line 30
    .line 31
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {p1, v0}, Lq;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    :cond_2
    const/4 p1, 0x0

    .line 39
    if-eqz p2, :cond_4

    .line 40
    .line 41
    invoke-virtual {p0}, Lcx2;->e0()Lwe0;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    new-instance v1, Lac0;

    .line 46
    .line 47
    const/4 v2, 0x3

    .line 48
    invoke-direct {v1, p0, p1, v2}, Lac0;-><init>(Ljava/lang/Object;Lvd0;I)V

    .line 49
    .line 50
    .line 51
    const/4 v2, 0x1

    .line 52
    sget-object v3, Lze0;->q:Lze0;

    .line 53
    .line 54
    invoke-static {v0, p1, v3, v1, v2}, Lfu;->G(Lwe0;Lne0;Lze0;Lwf1;I)Lsk4;

    .line 55
    .line 56
    .line 57
    new-instance v0, Ljx3;

    .line 58
    .line 59
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 60
    .line 61
    .line 62
    new-instance v1, Lfa;

    .line 63
    .line 64
    const/4 v2, 0x6

    .line 65
    invoke-direct {v1, v2, v0, p0}, Lfa;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    invoke-static {p0, v1}, Lj51;->F(Lcx2;Lgf1;)V

    .line 69
    .line 70
    .line 71
    iget-object v0, v0, Ljx3;->n:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v0, Ll82;

    .line 74
    .line 75
    if-eqz v0, :cond_3

    .line 76
    .line 77
    invoke-virtual {v0}, Ll82;->a()Ll82;

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_3
    move-object v0, p1

    .line 82
    :goto_0
    iput-object v0, p0, Lea1;->G:Ll82;

    .line 83
    .line 84
    iget-object v0, p0, Lea1;->H:Lf63;

    .line 85
    .line 86
    if-eqz v0, :cond_6

    .line 87
    .line 88
    invoke-virtual {v0}, Lf63;->A0()Lcx2;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    iget-boolean v0, v0, Lcx2;->A:Z

    .line 93
    .line 94
    if-eqz v0, :cond_6

    .line 95
    .line 96
    invoke-virtual {p0}, Lea1;->u0()V

    .line 97
    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_4
    iget-object v0, p0, Lea1;->G:Ll82;

    .line 101
    .line 102
    if-eqz v0, :cond_5

    .line 103
    .line 104
    invoke-virtual {v0}, Ll82;->b()V

    .line 105
    .line 106
    .line 107
    :cond_5
    iput-object p1, p0, Lea1;->G:Ll82;

    .line 108
    .line 109
    invoke-virtual {p0}, Lea1;->u0()V

    .line 110
    .line 111
    .line 112
    :cond_6
    :goto_1
    invoke-static {p0}, Lfu;->C(Lg94;)V

    .line 113
    .line 114
    .line 115
    iget-object v0, p0, Lea1;->D:Lrm2;

    .line 116
    .line 117
    if-eqz v0, :cond_9

    .line 118
    .line 119
    iget-object v1, p0, Lea1;->F:Lp91;

    .line 120
    .line 121
    if-eqz p2, :cond_8

    .line 122
    .line 123
    if-eqz v1, :cond_7

    .line 124
    .line 125
    new-instance p2, Lq91;

    .line 126
    .line 127
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p0, v0, p2}, Lea1;->t0(Lrm2;Lq02;)V

    .line 131
    .line 132
    .line 133
    iput-object p1, p0, Lea1;->F:Lp91;

    .line 134
    .line 135
    :cond_7
    new-instance p1, Lp91;

    .line 136
    .line 137
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 138
    .line 139
    .line 140
    invoke-virtual {p0, v0, p1}, Lea1;->t0(Lrm2;Lq02;)V

    .line 141
    .line 142
    .line 143
    iput-object p1, p0, Lea1;->F:Lp91;

    .line 144
    .line 145
    goto :goto_2

    .line 146
    :cond_8
    if-eqz v1, :cond_9

    .line 147
    .line 148
    new-instance p2, Lq91;

    .line 149
    .line 150
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p0, v0, p2}, Lea1;->t0(Lrm2;Lq02;)V

    .line 154
    .line 155
    .line 156
    iput-object p1, p0, Lea1;->F:Lp91;

    .line 157
    .line 158
    :cond_9
    :goto_2
    sget-object p0, Lj15;->a:Lj15;

    .line 159
    .line 160
    return-object p0
.end method
