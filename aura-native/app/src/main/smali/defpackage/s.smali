.class public final Ldefpackage/s;
.super Ldefpackage/ep4;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/wf1;


# instance fields
.field public final synthetic o:I

.field public p:I

.field public final synthetic q:J

.field public r:Ljava/lang/Object;

.field public final synthetic s:Ljava/lang/Object;

.field public final synthetic t:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;JLjava/lang/Object;Ldefpackage/vd0;I)V
    .locals 0

    .line 1
    iput p6, p0, Ldefpackage/s;->o:I

    .line 2
    .line 3
    iput-object p1, p0, Ldefpackage/s;->s:Ljava/lang/Object;

    .line 4
    .line 5
    iput-wide p2, p0, Ldefpackage/s;->q:J

    .line 6
    .line 7
    iput-object p4, p0, Ldefpackage/s;->t:Ljava/lang/Object;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Ldefpackage/ep4;-><init>(ILdefpackage/vd0;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldefpackage/vd0;)Ldefpackage/vd0;
    .locals 11

    .line 1
    iget v0, p0, Ldefpackage/s;->o:I

    .line 2
    .line 3
    iget-object v1, p0, Ldefpackage/s;->t:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, Ldefpackage/s;->s:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v3, Ldefpackage/s;

    .line 11
    .line 12
    move-object v4, v2

    .line 13
    check-cast v4, Ldefpackage/g74;

    .line 14
    .line 15
    move-object v7, v1

    .line 16
    check-cast v7, Ldefpackage/gx3;

    .line 17
    .line 18
    const/4 v9, 0x1

    .line 19
    iget-wide v5, p0, Ldefpackage/s;->q:J

    .line 20
    .line 21
    move-object v8, p2

    .line 22
    invoke-direct/range {v3 .. v9}, Ldefpackage/s;-><init>(Ljava/lang/Object;JLjava/lang/Object;Ldefpackage/vd0;I)V

    .line 23
    .line 24
    .line 25
    iput-object p1, v3, Ldefpackage/s;->r:Ljava/lang/Object;

    .line 26
    .line 27
    return-object v3

    .line 28
    :pswitch_0
    move-object v8, p2

    .line 29
    new-instance v4, Ldefpackage/s;

    .line 30
    .line 31
    move-object v5, v2

    .line 32
    check-cast v5, Ldefpackage/s22;

    .line 33
    .line 34
    check-cast v1, Ldefpackage/rm2;

    .line 35
    .line 36
    const/4 v10, 0x0

    .line 37
    iget-wide v6, p0, Ldefpackage/s;->q:J

    .line 38
    .line 39
    move-object v9, v8

    .line 40
    move-object v8, v1

    .line 41
    invoke-direct/range {v4 .. v10}, Ldefpackage/s;-><init>(Ljava/lang/Object;JLjava/lang/Object;Ldefpackage/vd0;I)V

    .line 42
    .line 43
    .line 44
    return-object v4

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Ldefpackage/s;->o:I

    .line 2
    .line 3
    sget-object v1, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Ldefpackage/e74;

    .line 9
    .line 10
    check-cast p2, Ldefpackage/vd0;

    .line 11
    .line 12
    invoke-virtual {p0, p1, p2}, Ldefpackage/s;->create(Ljava/lang/Object;Ldefpackage/vd0;)Ldefpackage/vd0;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Ldefpackage/s;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Ldefpackage/s;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, Ldefpackage/we0;

    .line 24
    .line 25
    check-cast p2, Ldefpackage/vd0;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, Ldefpackage/s;->create(Ljava/lang/Object;Ldefpackage/vd0;)Ldefpackage/vd0;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, Ldefpackage/s;

    .line 32
    .line 33
    invoke-virtual {p0, v1}, Ldefpackage/s;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 10

    .line 1
    iget v0, p0, Ldefpackage/s;->o:I

    .line 2
    .line 3
    sget-object v1, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 4
    .line 5
    iget-object v2, p0, Ldefpackage/s;->t:Ljava/lang/Object;

    .line 6
    .line 7
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 8
    .line 9
    sget-object v4, Ldefpackage/xe0;->n:Ldefpackage/xe0;

    .line 10
    .line 11
    iget-object v5, p0, Ldefpackage/s;->s:Ljava/lang/Object;

    .line 12
    .line 13
    const/4 v6, 0x1

    .line 14
    const/4 v7, 0x0

    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    check-cast v5, Ldefpackage/g74;

    .line 19
    .line 20
    iget v0, p0, Ldefpackage/s;->p:I

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    if-ne v0, v6, :cond_0

    .line 25
    .line 26
    invoke-static {p1}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-static {v3}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    move-object v1, v7

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    invoke-static {p1}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iget-object p1, p0, Ldefpackage/s;->r:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p1, Ldefpackage/e74;

    .line 41
    .line 42
    iget-wide v8, p0, Ldefpackage/s;->q:J

    .line 43
    .line 44
    invoke-virtual {v5, v8, v9}, Ldefpackage/g74;->h(J)F

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    check-cast v2, Ldefpackage/gx3;

    .line 49
    .line 50
    new-instance v3, Ldefpackage/d90;

    .line 51
    .line 52
    invoke-direct {v3, v2, v5, p1, v6}, Ldefpackage/d90;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 53
    .line 54
    .line 55
    iput v6, p0, Ldefpackage/s;->p:I

    .line 56
    .line 57
    const/16 p1, 0xc

    .line 58
    .line 59
    invoke-static {v0, v7, v3, p0, p1}, Ldefpackage/j51;->f(FLdefpackage/wd;Ldefpackage/wf1;Ldefpackage/ep4;I)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    if-ne p0, v4, :cond_2

    .line 64
    .line 65
    move-object v1, v4

    .line 66
    :cond_2
    :goto_0
    return-object v1

    .line 67
    :pswitch_0
    check-cast v2, Ldefpackage/rm2;

    .line 68
    .line 69
    iget v0, p0, Ldefpackage/s;->p:I

    .line 70
    .line 71
    const/4 v8, 0x3

    .line 72
    const/4 v9, 0x2

    .line 73
    if-eqz v0, :cond_6

    .line 74
    .line 75
    if-eq v0, v6, :cond_5

    .line 76
    .line 77
    if-eq v0, v9, :cond_4

    .line 78
    .line 79
    if-ne v0, v8, :cond_3

    .line 80
    .line 81
    invoke-static {p1}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    goto :goto_4

    .line 85
    :cond_3
    invoke-static {v3}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    move-object v1, v7

    .line 89
    goto :goto_4

    .line 90
    :cond_4
    iget-object v0, p0, Ldefpackage/s;->r:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v0, Ldefpackage/cq3;

    .line 93
    .line 94
    invoke-static {p1}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_5
    invoke-static {p1}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_6
    invoke-static {p1}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    check-cast v5, Ldefpackage/s22;

    .line 106
    .line 107
    iput v6, p0, Ldefpackage/s;->p:I

    .line 108
    .line 109
    invoke-interface {v5, p0}, Ldefpackage/s22;->R(Ldefpackage/wd0;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    if-ne p1, v4, :cond_7

    .line 114
    .line 115
    goto :goto_3

    .line 116
    :cond_7
    :goto_1
    new-instance p1, Ldefpackage/bq3;

    .line 117
    .line 118
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 119
    .line 120
    .line 121
    new-instance v0, Ldefpackage/cq3;

    .line 122
    .line 123
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 124
    .line 125
    .line 126
    iput-object v0, p0, Ldefpackage/s;->r:Ljava/lang/Object;

    .line 127
    .line 128
    iput v9, p0, Ldefpackage/s;->p:I

    .line 129
    .line 130
    invoke-virtual {v2, p1, p0}, Ldefpackage/rm2;->e(Ldefpackage/q02;Ldefpackage/vd0;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    if-ne p1, v4, :cond_8

    .line 135
    .line 136
    goto :goto_3

    .line 137
    :cond_8
    :goto_2
    iput-object v7, p0, Ldefpackage/s;->r:Ljava/lang/Object;

    .line 138
    .line 139
    iput v8, p0, Ldefpackage/s;->p:I

    .line 140
    .line 141
    invoke-virtual {v2, v0, p0}, Ldefpackage/rm2;->e(Ldefpackage/q02;Ldefpackage/vd0;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    if-ne p0, v4, :cond_9

    .line 146
    .line 147
    :goto_3
    move-object v1, v4

    .line 148
    :cond_9
    :goto_4
    return-object v1

    .line 149
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
