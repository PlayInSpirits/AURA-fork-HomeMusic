.class public final synthetic Lm94;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lwf1;


# instance fields
.field public final synthetic n:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lm94;->n:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget p0, p0, Lm94;->n:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    packed-switch p0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    sget-object p0, Lfz0;->K:Lk2;

    .line 8
    .line 9
    check-cast p2, Lj15;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lk2;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    sget-object p0, Lj15;->a:Lj15;

    .line 15
    .line 16
    return-object p0

    .line 17
    :pswitch_0
    check-cast p1, Lmt4;

    .line 18
    .line 19
    check-cast p2, Lle0;

    .line 20
    .line 21
    instance-of p0, p2, Lht4;

    .line 22
    .line 23
    if-eqz p0, :cond_0

    .line 24
    .line 25
    check-cast p2, Lht4;

    .line 26
    .line 27
    iget-object p0, p1, Lmt4;->a:Lne0;

    .line 28
    .line 29
    invoke-virtual {p2}, Lht4;->c()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    iget-object v0, p1, Lmt4;->b:[Ljava/lang/Object;

    .line 34
    .line 35
    iget v1, p1, Lmt4;->d:I

    .line 36
    .line 37
    aput-object p0, v0, v1

    .line 38
    .line 39
    iget-object p0, p1, Lmt4;->c:[Lht4;

    .line 40
    .line 41
    add-int/lit8 v0, v1, 0x1

    .line 42
    .line 43
    iput v0, p1, Lmt4;->d:I

    .line 44
    .line 45
    aput-object p2, p0, v1

    .line 46
    .line 47
    :cond_0
    return-object p1

    .line 48
    :pswitch_1
    check-cast p1, Lht4;

    .line 49
    .line 50
    check-cast p2, Lle0;

    .line 51
    .line 52
    if-eqz p1, :cond_1

    .line 53
    .line 54
    move-object v0, p1

    .line 55
    goto :goto_0

    .line 56
    :cond_1
    instance-of p0, p2, Lht4;

    .line 57
    .line 58
    if-eqz p0, :cond_2

    .line 59
    .line 60
    move-object v0, p2

    .line 61
    check-cast v0, Lht4;

    .line 62
    .line 63
    :cond_2
    :goto_0
    return-object v0

    .line 64
    :pswitch_2
    check-cast p2, Lle0;

    .line 65
    .line 66
    instance-of p0, p2, Lht4;

    .line 67
    .line 68
    if-eqz p0, :cond_6

    .line 69
    .line 70
    instance-of p0, p1, Ljava/lang/Integer;

    .line 71
    .line 72
    if-eqz p0, :cond_3

    .line 73
    .line 74
    move-object v0, p1

    .line 75
    check-cast v0, Ljava/lang/Integer;

    .line 76
    .line 77
    :cond_3
    const/4 p0, 0x1

    .line 78
    if-eqz v0, :cond_4

    .line 79
    .line 80
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    goto :goto_1

    .line 85
    :cond_4
    move p1, p0

    .line 86
    :goto_1
    if-nez p1, :cond_5

    .line 87
    .line 88
    move-object p1, p2

    .line 89
    goto :goto_2

    .line 90
    :cond_5
    add-int/2addr p1, p0

    .line 91
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    :cond_6
    :goto_2
    return-object p1

    .line 96
    :pswitch_3
    check-cast p1, Li94;

    .line 97
    .line 98
    check-cast p2, Li94;

    .line 99
    .line 100
    const/4 p0, 0x0

    .line 101
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    iget-object p1, p1, Li94;->d:Le94;

    .line 106
    .line 107
    sget-object v0, Ln94;->t:Lp94;

    .line 108
    .line 109
    iget-object p1, p1, Le94;->n:Lw03;

    .line 110
    .line 111
    invoke-virtual {p1, v0}, Lw03;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    if-nez p1, :cond_7

    .line 116
    .line 117
    move-object p1, p0

    .line 118
    :cond_7
    check-cast p1, Ljava/lang/Number;

    .line 119
    .line 120
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 121
    .line 122
    .line 123
    move-result p1

    .line 124
    iget-object p2, p2, Li94;->d:Le94;

    .line 125
    .line 126
    iget-object p2, p2, Le94;->n:Lw03;

    .line 127
    .line 128
    invoke-virtual {p2, v0}, Lw03;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object p2

    .line 132
    if-nez p2, :cond_8

    .line 133
    .line 134
    goto :goto_3

    .line 135
    :cond_8
    move-object p0, p2

    .line 136
    :goto_3
    check-cast p0, Ljava/lang/Number;

    .line 137
    .line 138
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 139
    .line 140
    .line 141
    move-result p0

    .line 142
    invoke-static {p1, p0}, Ljava/lang/Float;->compare(FF)I

    .line 143
    .line 144
    .line 145
    move-result p0

    .line 146
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    return-object p0

    .line 151
    :pswitch_4
    if-nez p1, :cond_9

    .line 152
    .line 153
    move-object p1, p2

    .line 154
    :cond_9
    return-object p1

    .line 155
    :pswitch_5
    if-nez p1, :cond_a

    .line 156
    .line 157
    if-nez p2, :cond_a

    .line 158
    .line 159
    goto :goto_4

    .line 160
    :cond_a
    invoke-static {}, Lkf2;->k()V

    .line 161
    .line 162
    .line 163
    :goto_4
    return-object v0

    .line 164
    :pswitch_6
    check-cast p1, Ljava/lang/Boolean;

    .line 165
    .line 166
    check-cast p2, Ljava/lang/Boolean;

    .line 167
    .line 168
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 169
    .line 170
    .line 171
    return-object p1

    .line 172
    :pswitch_7
    check-cast p1, Lwb;

    .line 173
    .line 174
    check-cast p2, Lwb;

    .line 175
    .line 176
    return-object p1

    .line 177
    :pswitch_8
    check-cast p1, Lmb;

    .line 178
    .line 179
    check-cast p2, Lmb;

    .line 180
    .line 181
    return-object p1

    .line 182
    :pswitch_9
    check-cast p1, Lqd0;

    .line 183
    .line 184
    check-cast p2, Lqd0;

    .line 185
    .line 186
    return-object p1

    .line 187
    :pswitch_a
    check-cast p1, Ljava/lang/String;

    .line 188
    .line 189
    check-cast p2, Ljava/lang/String;

    .line 190
    .line 191
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 192
    .line 193
    const-string p1, "merge function called on unmergeable property PaneTitle."

    .line 194
    .line 195
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    throw p0

    .line 199
    :pswitch_b
    check-cast p1, Lac4;

    .line 200
    .line 201
    check-cast p2, Lac4;

    .line 202
    .line 203
    return-object p1

    .line 204
    :pswitch_c
    check-cast p1, Ljava/util/List;

    .line 205
    .line 206
    check-cast p2, Ljava/util/List;

    .line 207
    .line 208
    if-eqz p1, :cond_b

    .line 209
    .line 210
    new-instance p0, Ljava/util/ArrayList;

    .line 211
    .line 212
    invoke-direct {p0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 216
    .line 217
    .line 218
    move-object p2, p0

    .line 219
    :cond_b
    return-object p2

    .line 220
    nop

    .line 221
    :pswitch_data_0
    .packed-switch 0x0
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
