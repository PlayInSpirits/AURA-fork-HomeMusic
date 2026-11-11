.class public final Lkb1;
.super Lr14;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lwf1;


# instance fields
.field public final synthetic o:I

.field public p:Ljava/lang/Object;

.field public q:I

.field public synthetic r:Ljava/lang/Object;

.field public final synthetic s:Lsf1;


# direct methods
.method public constructor <init>(Lgf1;Lvd0;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lkb1;->o:I

    .line 12
    iput-object p1, p0, Lkb1;->s:Lsf1;

    invoke-direct {p0, p2}, Lr14;-><init>(Lvd0;)V

    return-void
.end method

.method public constructor <init>(Lne0;Lwf1;Lvd0;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lkb1;->o:I

    .line 3
    .line 4
    iput-object p1, p0, Lkb1;->r:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Lkb1;->s:Lsf1;

    .line 7
    .line 8
    invoke-direct {p0, p3}, Lr14;-><init>(Lvd0;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvd0;)Lvd0;
    .locals 2

    .line 1
    iget v0, p0, Lkb1;->o:I

    .line 2
    .line 3
    iget-object v1, p0, Lkb1;->s:Lsf1;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p0, Lkb1;

    .line 9
    .line 10
    check-cast v1, Lgf1;

    .line 11
    .line 12
    invoke-direct {p0, v1, p2}, Lkb1;-><init>(Lgf1;Lvd0;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lkb1;->r:Ljava/lang/Object;

    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_0
    new-instance v0, Lkb1;

    .line 19
    .line 20
    iget-object p0, p0, Lkb1;->r:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p0, Lne0;

    .line 23
    .line 24
    check-cast v1, Lwf1;

    .line 25
    .line 26
    invoke-direct {v0, p0, v1, p2}, Lkb1;-><init>(Lne0;Lwf1;Lvd0;)V

    .line 27
    .line 28
    .line 29
    iput-object p1, v0, Lkb1;->p:Ljava/lang/Object;

    .line 30
    .line 31
    return-object v0

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lkb1;->o:I

    .line 2
    .line 3
    sget-object v1, Lj15;->a:Lj15;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Lba4;

    .line 9
    .line 10
    check-cast p2, Lvd0;

    .line 11
    .line 12
    invoke-virtual {p0, p1, p2}, Lkb1;->create(Ljava/lang/Object;Lvd0;)Lvd0;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lkb1;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lkb1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, Lhp4;

    .line 24
    .line 25
    check-cast p2, Lvd0;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, Lkb1;->create(Ljava/lang/Object;Lvd0;)Lvd0;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, Lkb1;

    .line 32
    .line 33
    invoke-virtual {p0, v1}, Lkb1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, Lkb1;->o:I

    .line 2
    .line 3
    sget-object v1, Lj15;->a:Lj15;

    .line 4
    .line 5
    iget-object v2, p0, Lkb1;->s:Lsf1;

    .line 6
    .line 7
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 8
    .line 9
    sget-object v4, Lxe0;->n:Lxe0;

    .line 10
    .line 11
    const/4 v5, 0x1

    .line 12
    const/4 v6, 0x0

    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    iget v0, p0, Lkb1;->q:I

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    if-ne v0, v5, :cond_0

    .line 21
    .line 22
    iget-object v0, p0, Lkb1;->p:Ljava/lang/Object;

    .line 23
    .line 24
    iget-object v3, p0, Lkb1;->r:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v3, Lba4;

    .line 27
    .line 28
    invoke-static {p1}, Lkb4;->X(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-static {v3}, Lkf2;->o(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    move-object v1, v6

    .line 36
    goto :goto_1

    .line 37
    :cond_1
    invoke-static {p1}, Lkb4;->X(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Lkb1;->r:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p1, Lba4;

    .line 43
    .line 44
    move-object v3, p1

    .line 45
    :cond_2
    move-object p1, v2

    .line 46
    check-cast p1, Lgf1;

    .line 47
    .line 48
    invoke-interface {p1}, Lgf1;->invoke()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    if-eqz p1, :cond_3

    .line 53
    .line 54
    iput-object v3, p0, Lkb1;->r:Ljava/lang/Object;

    .line 55
    .line 56
    iput-object p1, p0, Lkb1;->p:Ljava/lang/Object;

    .line 57
    .line 58
    iput v5, p0, Lkb1;->q:I

    .line 59
    .line 60
    invoke-virtual {v3, p0, p1}, Lba4;->b(Lvd0;Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    move-object v1, v4

    .line 64
    goto :goto_1

    .line 65
    :cond_3
    move-object v0, v6

    .line 66
    :goto_0
    if-nez v0, :cond_2

    .line 67
    .line 68
    :goto_1
    return-object v1

    .line 69
    :pswitch_0
    iget-object v0, p0, Lkb1;->r:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v0, Lne0;

    .line 72
    .line 73
    iget v7, p0, Lkb1;->q:I

    .line 74
    .line 75
    sget-object v8, Lln3;->p:Lln3;

    .line 76
    .line 77
    const/4 v9, 0x3

    .line 78
    const/4 v10, 0x2

    .line 79
    if-eqz v7, :cond_8

    .line 80
    .line 81
    if-eq v7, v5, :cond_7

    .line 82
    .line 83
    if-eq v7, v10, :cond_5

    .line 84
    .line 85
    if-ne v7, v9, :cond_4

    .line 86
    .line 87
    iget-object v3, p0, Lkb1;->p:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v3, Lhp4;

    .line 90
    .line 91
    invoke-static {p1}, Lkb4;->X(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_4
    invoke-static {v3}, Lkf2;->o(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    move-object v1, v6

    .line 99
    goto :goto_7

    .line 100
    :cond_5
    iget-object v3, p0, Lkb1;->p:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v3, Lhp4;

    .line 103
    .line 104
    :try_start_0
    invoke-static {p1}, Lkb4;->X(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 105
    .line 106
    .line 107
    :cond_6
    :goto_2
    move-object p1, v3

    .line 108
    goto :goto_3

    .line 109
    :catch_0
    move-exception p1

    .line 110
    goto :goto_5

    .line 111
    :cond_7
    iget-object v3, p0, Lkb1;->p:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v3, Lhp4;

    .line 114
    .line 115
    :try_start_1
    invoke-static {p1}, Lkb4;->X(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0

    .line 116
    .line 117
    .line 118
    goto :goto_4

    .line 119
    :cond_8
    invoke-static {p1}, Lkb4;->X(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    iget-object p1, p0, Lkb1;->p:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast p1, Lhp4;

    .line 125
    .line 126
    :goto_3
    invoke-static {v0}, Lgb;->L(Lne0;)Z

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    if-eqz v3, :cond_b

    .line 131
    .line 132
    :try_start_2
    move-object v3, v2

    .line 133
    check-cast v3, Lwf1;

    .line 134
    .line 135
    iput-object p1, p0, Lkb1;->p:Ljava/lang/Object;

    .line 136
    .line 137
    iput v5, p0, Lkb1;->q:I

    .line 138
    .line 139
    invoke-interface {v3, p1, p0}, Lwf1;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v3
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_1

    .line 143
    if-ne v3, v4, :cond_9

    .line 144
    .line 145
    goto :goto_6

    .line 146
    :cond_9
    move-object v3, p1

    .line 147
    :goto_4
    :try_start_3
    iput-object v3, p0, Lkb1;->p:Ljava/lang/Object;

    .line 148
    .line 149
    iput v10, p0, Lkb1;->q:I

    .line 150
    .line 151
    invoke-static {v3, v8, p0}, Lxl;->f(Lhp4;Lln3;Ljp;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object p1
    :try_end_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_3 .. :try_end_3} :catch_0

    .line 155
    if-ne p1, v4, :cond_6

    .line 156
    .line 157
    goto :goto_6

    .line 158
    :catch_1
    move-exception v3

    .line 159
    move-object v11, v3

    .line 160
    move-object v3, p1

    .line 161
    move-object p1, v11

    .line 162
    :goto_5
    invoke-static {v0}, Lgb;->L(Lne0;)Z

    .line 163
    .line 164
    .line 165
    move-result v6

    .line 166
    if-eqz v6, :cond_a

    .line 167
    .line 168
    iput-object v3, p0, Lkb1;->p:Ljava/lang/Object;

    .line 169
    .line 170
    iput v9, p0, Lkb1;->q:I

    .line 171
    .line 172
    invoke-static {v3, v8, p0}, Lxl;->f(Lhp4;Lln3;Ljp;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    if-ne p1, v4, :cond_6

    .line 177
    .line 178
    :goto_6
    move-object v1, v4

    .line 179
    goto :goto_7

    .line 180
    :cond_a
    throw p1

    .line 181
    :cond_b
    :goto_7
    return-object v1

    .line 182
    nop

    .line 183
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
