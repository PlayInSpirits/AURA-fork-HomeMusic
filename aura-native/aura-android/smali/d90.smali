.class public final synthetic Ld90;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lwf1;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ljava/lang/Object;

.field public final synthetic p:Ljava/lang/Object;

.field public final synthetic q:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 13
    iput p4, p0, Ld90;->n:I

    iput-object p1, p0, Ld90;->o:Ljava/lang/Object;

    iput-object p2, p0, Ld90;->p:Ljava/lang/Object;

    iput-object p3, p0, Ld90;->q:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lwf1;II)V
    .locals 0

    .line 1
    iput p5, p0, Ld90;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Ld90;->o:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Ld90;->p:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Ld90;->q:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Ld90;->n:I

    .line 2
    .line 3
    sget-object v1, Lj15;->a:Lj15;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object v3, p0, Ld90;->q:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object v4, p0, Ld90;->p:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object p0, p0, Ld90;->o:Ljava/lang/Object;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast p0, Lwd5;

    .line 16
    .line 17
    check-cast v4, Lh80;

    .line 18
    .line 19
    check-cast v3, Lr70;

    .line 20
    .line 21
    check-cast p1, Lrg1;

    .line 22
    .line 23
    check-cast p2, Ljava/lang/Integer;

    .line 24
    .line 25
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    and-int/lit8 v0, p2, 0x3

    .line 30
    .line 31
    const/4 v5, 0x2

    .line 32
    const/4 v6, 0x0

    .line 33
    if-eq v0, v5, :cond_0

    .line 34
    .line 35
    move v0, v2

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    move v0, v6

    .line 38
    :goto_0
    and-int/2addr p2, v2

    .line 39
    invoke-virtual {p1, p2, v0}, Lrg1;->K(IZ)Z

    .line 40
    .line 41
    .line 42
    move-result p2

    .line 43
    if-eqz p2, :cond_5

    .line 44
    .line 45
    iget-object p2, p0, Lwd5;->n:Lra;

    .line 46
    .line 47
    invoke-virtual {p1, p0}, Lrg1;->g(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    invoke-virtual {p1}, Lrg1;->H()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    const/4 v7, 0x0

    .line 56
    sget-object v8, Lj80;->a:Li80;

    .line 57
    .line 58
    if-nez v0, :cond_1

    .line 59
    .line 60
    if-ne v5, v8, :cond_2

    .line 61
    .line 62
    :cond_1
    new-instance v5, Lvd5;

    .line 63
    .line 64
    invoke-direct {v5, p0, v7, v6}, Lvd5;-><init>(Lwd5;Lvd0;I)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1, v5}, Lrg1;->b0(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    :cond_2
    check-cast v5, Lwf1;

    .line 71
    .line 72
    invoke-static {v5, p1, p2}, Lbu;->c(Lwf1;Lrg1;Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1, p0}, Lrg1;->g(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    invoke-virtual {p1}, Lrg1;->H()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    if-nez v0, :cond_3

    .line 84
    .line 85
    if-ne v5, v8, :cond_4

    .line 86
    .line 87
    :cond_3
    new-instance v5, Lvd5;

    .line 88
    .line 89
    invoke-direct {v5, p0, v7, v2}, Lvd5;-><init>(Lwd5;Lvd0;I)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1, v5}, Lrg1;->b0(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    :cond_4
    check-cast v5, Lwf1;

    .line 96
    .line 97
    invoke-static {v5, p1, p2}, Lbu;->c(Lwf1;Lrg1;Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v4, p2, v3, p1, v6}, Lh80;->a(Lra;Lr70;Lrg1;I)V

    .line 101
    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_5
    invoke-virtual {p1}, Lrg1;->N()V

    .line 105
    .line 106
    .line 107
    :goto_1
    return-object v1

    .line 108
    :pswitch_0
    check-cast p0, Lkn4;

    .line 109
    .line 110
    check-cast v4, Ldx2;

    .line 111
    .line 112
    check-cast v3, Lwf1;

    .line 113
    .line 114
    check-cast p1, Lrg1;

    .line 115
    .line 116
    check-cast p2, Ljava/lang/Integer;

    .line 117
    .line 118
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    const/16 p2, 0x9

    .line 122
    .line 123
    invoke-static {p2}, Lxl;->O(I)I

    .line 124
    .line 125
    .line 126
    move-result p2

    .line 127
    invoke-static {p0, v4, v3, p1, p2}, Lgn4;->a(Lkn4;Ldx2;Lwf1;Lrg1;I)V

    .line 128
    .line 129
    .line 130
    return-object v1

    .line 131
    :pswitch_1
    check-cast p0, Lgx3;

    .line 132
    .line 133
    check-cast v4, Lg74;

    .line 134
    .line 135
    check-cast v3, Le74;

    .line 136
    .line 137
    check-cast p1, Ljava/lang/Float;

    .line 138
    .line 139
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 140
    .line 141
    .line 142
    move-result p1

    .line 143
    check-cast p2, Ljava/lang/Float;

    .line 144
    .line 145
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    iget p2, p0, Lgx3;->n:F

    .line 149
    .line 150
    sub-float/2addr p1, p2

    .line 151
    invoke-virtual {v4, p1}, Lg74;->e(F)F

    .line 152
    .line 153
    .line 154
    move-result p1

    .line 155
    invoke-virtual {v4, p1}, Lg74;->i(F)J

    .line 156
    .line 157
    .line 158
    move-result-wide p1

    .line 159
    iget-object v0, v3, Le74;->a:Lg74;

    .line 160
    .line 161
    iget-object v3, v0, Lg74;->k:Lq64;

    .line 162
    .line 163
    invoke-virtual {v0, v3, p1, p2, v2}, Lg74;->d(Lq64;JI)J

    .line 164
    .line 165
    .line 166
    move-result-wide p1

    .line 167
    invoke-virtual {v4, p1, p2}, Lg74;->h(J)F

    .line 168
    .line 169
    .line 170
    move-result p1

    .line 171
    invoke-virtual {v4, p1}, Lg74;->e(F)F

    .line 172
    .line 173
    .line 174
    move-result p1

    .line 175
    iget p2, p0, Lgx3;->n:F

    .line 176
    .line 177
    add-float/2addr p2, p1

    .line 178
    iput p2, p0, Lgx3;->n:F

    .line 179
    .line 180
    return-object v1

    .line 181
    :pswitch_2
    check-cast p0, Lub3;

    .line 182
    .line 183
    check-cast v4, Lpa;

    .line 184
    .line 185
    check-cast v3, Lr70;

    .line 186
    .line 187
    check-cast p1, Lrg1;

    .line 188
    .line 189
    check-cast p2, Ljava/lang/Integer;

    .line 190
    .line 191
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    invoke-static {v2}, Lxl;->O(I)I

    .line 195
    .line 196
    .line 197
    move-result p2

    .line 198
    invoke-static {p0, v4, v3, p1, p2}, Lg90;->a(Lub3;Lpa;Lr70;Lrg1;I)V

    .line 199
    .line 200
    .line 201
    return-object v1

    .line 202
    nop

    .line 203
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
