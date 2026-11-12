.class public final Lir0;
.super Lq42;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lif1;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lir0;->n:I

    .line 2
    .line 3
    iput-object p2, p0, Lir0;->o:Ljava/lang/Object;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Lq42;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lir0;->n:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    sget-object v2, Lj15;->a:Lj15;

    .line 5
    .line 6
    const-string v3, "(this)"

    .line 7
    .line 8
    iget-object p0, p0, Lir0;->o:Ljava/lang/Object;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast p0, Lx03;

    .line 14
    .line 15
    if-ne p1, p0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    :goto_0
    return-object v3

    .line 23
    :pswitch_0
    check-cast p0, Lr03;

    .line 24
    .line 25
    if-ne p1, p0, :cond_1

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    :goto_1
    return-object v3

    .line 33
    :pswitch_1
    check-cast p0, Lq03;

    .line 34
    .line 35
    if-ne p1, p0, :cond_2

    .line 36
    .line 37
    goto :goto_2

    .line 38
    :cond_2
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    :goto_2
    return-object v3

    .line 43
    :pswitch_2
    check-cast p1, Ljava/lang/Throwable;

    .line 44
    .line 45
    check-cast p0, Lic2;

    .line 46
    .line 47
    const/4 p1, 0x0

    .line 48
    invoke-interface {p0, p1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 49
    .line 50
    .line 51
    return-object v2

    .line 52
    :pswitch_3
    check-cast p1, Lsv0;

    .line 53
    .line 54
    check-cast p0, Lsj1;

    .line 55
    .line 56
    iget-object v0, p0, Lsj1;->l:Lnc;

    .line 57
    .line 58
    iget-boolean v1, p0, Lsj1;->n:Z

    .line 59
    .line 60
    if-eqz v1, :cond_3

    .line 61
    .line 62
    iget-boolean v1, p0, Lsj1;->A:Z

    .line 63
    .line 64
    if-eqz v1, :cond_3

    .line 65
    .line 66
    if-eqz v0, :cond_3

    .line 67
    .line 68
    invoke-interface {p1}, Lsv0;->O()Li61;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-virtual {v1}, Li61;->j()J

    .line 73
    .line 74
    .line 75
    move-result-wide v3

    .line 76
    invoke-virtual {v1}, Li61;->g()Ljz;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    invoke-interface {v5}, Ljz;->e()V

    .line 81
    .line 82
    .line 83
    :try_start_0
    iget-object v5, v1, Li61;->o:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v5, Lzg5;

    .line 86
    .line 87
    iget-object v5, v5, Lzg5;->n:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v5, Li61;

    .line 90
    .line 91
    invoke-virtual {v5}, Li61;->g()Ljz;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    invoke-interface {v5, v0}, Ljz;->i(Lnc;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p0, p1}, Lsj1;->c(Lsv0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 99
    .line 100
    .line 101
    invoke-virtual {v1}, Li61;->g()Ljz;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    invoke-interface {p0}, Ljz;->k()V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v1, v3, v4}, Li61;->t(J)V

    .line 109
    .line 110
    .line 111
    goto :goto_3

    .line 112
    :catchall_0
    move-exception p0

    .line 113
    invoke-virtual {v1}, Li61;->g()Ljz;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    invoke-interface {p1}, Ljz;->k()V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v1, v3, v4}, Li61;->t(J)V

    .line 121
    .line 122
    .line 123
    throw p0

    .line 124
    :cond_3
    invoke-virtual {p0, p1}, Lsj1;->c(Lsv0;)V

    .line 125
    .line 126
    .line 127
    :goto_3
    return-object v2

    .line 128
    :pswitch_4
    check-cast p1, La23;

    .line 129
    .line 130
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    check-cast p0, Lrd1;

    .line 134
    .line 135
    new-instance v0, Ld70;

    .line 136
    .line 137
    invoke-direct {v0, v1, p0, p1}, Ld70;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    return-object v0

    .line 141
    :pswitch_5
    check-cast p1, Ljava/io/IOException;

    .line 142
    .line 143
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    check-cast p0, Ljr0;

    .line 147
    .line 148
    sget-object p1, Lze5;->a:Ltl1;

    .line 149
    .line 150
    iput-boolean v1, p0, Ljr0;->x:Z

    .line 151
    .line 152
    return-object v2

    .line 153
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
