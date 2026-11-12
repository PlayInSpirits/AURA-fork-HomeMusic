.class public final Lx81;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lp81;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lp81;

.field public final synthetic p:Lsf1;


# direct methods
.method public synthetic constructor <init>(Lp81;Lsf1;I)V
    .locals 0

    .line 1
    iput p3, p0, Lx81;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lx81;->o:Lp81;

    .line 4
    .line 5
    iput-object p2, p0, Lx81;->p:Lsf1;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(Lq81;Lvd0;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget v0, p0, Lx81;->n:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    iget-object v2, p0, Lx81;->p:Lsf1;

    .line 5
    .line 6
    iget-object v3, p0, Lx81;->o:Lp81;

    .line 7
    .line 8
    sget-object v4, Lj15;->a:Lj15;

    .line 9
    .line 10
    sget-object v5, Lxe0;->n:Lxe0;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    new-instance p0, Llv0;

    .line 16
    .line 17
    check-cast v2, Lwf1;

    .line 18
    .line 19
    invoke-direct {p0, v1, p1, v2}, Llv0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    invoke-interface {v3, p0, p2}, Lp81;->a(Lq81;Lvd0;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    if-ne p0, v5, :cond_0

    .line 27
    .line 28
    move-object v4, p0

    .line 29
    :cond_0
    return-object v4

    .line 30
    :pswitch_0
    new-instance p0, Lfx3;

    .line 31
    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    .line 34
    .line 35
    check-cast v3, Lf10;

    .line 36
    .line 37
    new-instance v0, Lz81;

    .line 38
    .line 39
    check-cast v2, Lpv3;

    .line 40
    .line 41
    invoke-direct {v0, p0, p1, v2}, Lz81;-><init>(Lfx3;Lq81;Lpv3;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v3, v0, p2}, La10;->a(Lq81;Lvd0;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    if-ne p0, v5, :cond_1

    .line 49
    .line 50
    move-object v4, p0

    .line 51
    :cond_1
    return-object v4

    .line 52
    :pswitch_1
    instance-of v0, p2, Lw81;

    .line 53
    .line 54
    if-eqz v0, :cond_2

    .line 55
    .line 56
    move-object v0, p2

    .line 57
    check-cast v0, Lw81;

    .line 58
    .line 59
    iget v2, v0, Lw81;->o:I

    .line 60
    .line 61
    const/high16 v3, -0x80000000

    .line 62
    .line 63
    and-int v6, v2, v3

    .line 64
    .line 65
    if-eqz v6, :cond_2

    .line 66
    .line 67
    sub-int/2addr v2, v3

    .line 68
    iput v2, v0, Lw81;->o:I

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_2
    new-instance v0, Lw81;

    .line 72
    .line 73
    invoke-direct {v0, p0, p2}, Lw81;-><init>(Lx81;Lvd0;)V

    .line 74
    .line 75
    .line 76
    :goto_0
    iget-object p2, v0, Lw81;->n:Ljava/lang/Object;

    .line 77
    .line 78
    iget v2, v0, Lw81;->o:I

    .line 79
    .line 80
    const/4 v3, 0x0

    .line 81
    const/4 v6, 0x1

    .line 82
    if-eqz v2, :cond_5

    .line 83
    .line 84
    if-eq v2, v6, :cond_4

    .line 85
    .line 86
    if-ne v2, v1, :cond_3

    .line 87
    .line 88
    iget-wide p0, v0, Lw81;->t:J

    .line 89
    .line 90
    iget-object v2, v0, Lw81;->s:Ljava/lang/Throwable;

    .line 91
    .line 92
    iget-object v7, v0, Lw81;->r:Lq81;

    .line 93
    .line 94
    iget-object v8, v0, Lw81;->q:Lx81;

    .line 95
    .line 96
    invoke-static {p2}, Lkb4;->X(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    goto :goto_3

    .line 100
    :cond_3
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 101
    .line 102
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    move-object v4, v3

    .line 106
    goto/16 :goto_6

    .line 107
    .line 108
    :cond_4
    iget-wide p0, v0, Lw81;->t:J

    .line 109
    .line 110
    iget-object v2, v0, Lw81;->r:Lq81;

    .line 111
    .line 112
    iget-object v7, v0, Lw81;->q:Lx81;

    .line 113
    .line 114
    invoke-static {p2}, Lkb4;->X(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    move-object v8, v7

    .line 118
    move-object v7, v2

    .line 119
    goto :goto_1

    .line 120
    :cond_5
    invoke-static {p2}, Lkb4;->X(Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    const-wide/16 v7, 0x0

    .line 124
    .line 125
    :cond_6
    iget-object p2, p0, Lx81;->o:Lp81;

    .line 126
    .line 127
    check-cast p2, Lj91;

    .line 128
    .line 129
    iput-object p0, v0, Lw81;->q:Lx81;

    .line 130
    .line 131
    iput-object p1, v0, Lw81;->r:Lq81;

    .line 132
    .line 133
    iput-object v3, v0, Lw81;->s:Ljava/lang/Throwable;

    .line 134
    .line 135
    iput-wide v7, v0, Lw81;->t:J

    .line 136
    .line 137
    iput v6, v0, Lw81;->o:I

    .line 138
    .line 139
    invoke-static {p2, p1, v0}, Lya4;->f(Lj91;Lq81;Lwd0;)Ljava/io/Serializable;

    .line 140
    .line 141
    .line 142
    move-result-object p2

    .line 143
    if-ne p2, v5, :cond_7

    .line 144
    .line 145
    goto :goto_2

    .line 146
    :cond_7
    move-wide v11, v7

    .line 147
    move-object v8, p0

    .line 148
    move-object v7, p1

    .line 149
    move-wide p0, v11

    .line 150
    :goto_1
    move-object v2, p2

    .line 151
    check-cast v2, Ljava/lang/Throwable;

    .line 152
    .line 153
    if-eqz v2, :cond_a

    .line 154
    .line 155
    iget-object p2, v8, Lx81;->p:Lsf1;

    .line 156
    .line 157
    check-cast p2, Lg15;

    .line 158
    .line 159
    new-instance v9, Ljava/lang/Long;

    .line 160
    .line 161
    invoke-direct {v9, p0, p1}, Ljava/lang/Long;-><init>(J)V

    .line 162
    .line 163
    .line 164
    iput-object v8, v0, Lw81;->q:Lx81;

    .line 165
    .line 166
    iput-object v7, v0, Lw81;->r:Lq81;

    .line 167
    .line 168
    iput-object v2, v0, Lw81;->s:Ljava/lang/Throwable;

    .line 169
    .line 170
    iput-wide p0, v0, Lw81;->t:J

    .line 171
    .line 172
    iput v1, v0, Lw81;->o:I

    .line 173
    .line 174
    invoke-virtual {p2, v7, v2, v9, v0}, Lg15;->d(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object p2

    .line 178
    if-ne p2, v5, :cond_8

    .line 179
    .line 180
    :goto_2
    move-object v4, v5

    .line 181
    goto :goto_6

    .line 182
    :cond_8
    :goto_3
    check-cast p2, Ljava/lang/Boolean;

    .line 183
    .line 184
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 185
    .line 186
    .line 187
    move-result p2

    .line 188
    if-eqz p2, :cond_9

    .line 189
    .line 190
    const-wide/16 v9, 0x1

    .line 191
    .line 192
    add-long/2addr p0, v9

    .line 193
    move p2, v6

    .line 194
    :goto_4
    move-wide v11, p0

    .line 195
    move-object p1, v7

    .line 196
    move-object p0, v8

    .line 197
    move-wide v7, v11

    .line 198
    goto :goto_5

    .line 199
    :cond_9
    throw v2

    .line 200
    :cond_a
    const/4 p2, 0x0

    .line 201
    goto :goto_4

    .line 202
    :goto_5
    if-nez p2, :cond_6

    .line 203
    .line 204
    :goto_6
    return-object v4

    .line 205
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
