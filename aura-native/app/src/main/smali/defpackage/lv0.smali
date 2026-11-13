.class public final Ldefpackage/lv0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/q81;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ljava/lang/Object;

.field public final synthetic p:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Ldefpackage/lv0;->n:I

    .line 2
    .line 3
    iput-object p2, p0, Ldefpackage/lv0;->o:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Ldefpackage/lv0;->p:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ldefpackage/vd0;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, Ldefpackage/lv0;->n:I

    .line 2
    .line 3
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 4
    .line 5
    sget-object v2, Ldefpackage/xe0;->n:Ldefpackage/xe0;

    .line 6
    .line 7
    const/high16 v3, -0x80000000

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    const/4 v5, 0x0

    .line 11
    iget-object v6, p0, Ldefpackage/lv0;->p:Ljava/lang/Object;

    .line 12
    .line 13
    sget-object v7, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 14
    .line 15
    iget-object v8, p0, Ldefpackage/lv0;->o:Ljava/lang/Object;

    .line 16
    .line 17
    packed-switch v0, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    check-cast p1, Ldefpackage/tc0;

    .line 21
    .line 22
    check-cast v8, Ldefpackage/c93;

    .line 23
    .line 24
    check-cast v6, Ldefpackage/dd5;

    .line 25
    .line 26
    invoke-interface {v8, v6, p1}, Ldefpackage/c93;->a(Ldefpackage/dd5;Ldefpackage/tc0;)V

    .line 27
    .line 28
    .line 29
    return-object v7

    .line 30
    :pswitch_0
    instance-of v0, p2, Ldefpackage/g91;

    .line 31
    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    move-object v0, p2

    .line 35
    check-cast v0, Ldefpackage/g91;

    .line 36
    .line 37
    iget v9, v0, Ldefpackage/g91;->o:I

    .line 38
    .line 39
    and-int v10, v9, v3

    .line 40
    .line 41
    if-eqz v10, :cond_0

    .line 42
    .line 43
    sub-int/2addr v9, v3

    .line 44
    iput v9, v0, Ldefpackage/g91;->o:I

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    new-instance v0, Ldefpackage/g91;

    .line 48
    .line 49
    invoke-direct {v0, p0, p2}, Ldefpackage/g91;-><init>(Ldefpackage/lv0;Ldefpackage/vd0;)V

    .line 50
    .line 51
    .line 52
    :goto_0
    iget-object p0, v0, Ldefpackage/g91;->n:Ljava/lang/Object;

    .line 53
    .line 54
    iget p2, v0, Ldefpackage/g91;->o:I

    .line 55
    .line 56
    const/4 v3, 0x2

    .line 57
    if-eqz p2, :cond_3

    .line 58
    .line 59
    if-eq p2, v4, :cond_2

    .line 60
    .line 61
    if-ne p2, v3, :cond_1

    .line 62
    .line 63
    invoke-static {p0}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_1
    invoke-static {v1}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    move-object v2, v5

    .line 71
    goto :goto_3

    .line 72
    :cond_2
    iget-object p1, v0, Ldefpackage/g91;->r:Ldefpackage/q81;

    .line 73
    .line 74
    iget-object p2, v0, Ldefpackage/g91;->q:Ljava/lang/Object;

    .line 75
    .line 76
    invoke-static {p0}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_3
    invoke-static {p0}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    move-object p0, v8

    .line 84
    check-cast p0, Ldefpackage/q81;

    .line 85
    .line 86
    check-cast v6, Ldefpackage/wf1;

    .line 87
    .line 88
    iput-object p1, v0, Ldefpackage/g91;->q:Ljava/lang/Object;

    .line 89
    .line 90
    iput-object p0, v0, Ldefpackage/g91;->r:Ldefpackage/q81;

    .line 91
    .line 92
    iput v4, v0, Ldefpackage/g91;->o:I

    .line 93
    .line 94
    invoke-interface {v6, p1, v0}, Ldefpackage/wf1;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p2

    .line 98
    if-ne p2, v2, :cond_4

    .line 99
    .line 100
    goto :goto_3

    .line 101
    :cond_4
    move-object p2, p1

    .line 102
    move-object p1, p0

    .line 103
    :goto_1
    iput-object v5, v0, Ldefpackage/g91;->q:Ljava/lang/Object;

    .line 104
    .line 105
    iput-object v5, v0, Ldefpackage/g91;->r:Ldefpackage/q81;

    .line 106
    .line 107
    iput v3, v0, Ldefpackage/g91;->o:I

    .line 108
    .line 109
    invoke-interface {p1, p2, v0}, Ldefpackage/q81;->b(Ljava/lang/Object;Ldefpackage/vd0;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    if-ne p0, v2, :cond_5

    .line 114
    .line 115
    goto :goto_3

    .line 116
    :cond_5
    :goto_2
    move-object v2, v7

    .line 117
    :goto_3
    return-object v2

    .line 118
    :pswitch_1
    instance-of v0, p2, Ldefpackage/c91;

    .line 119
    .line 120
    if-eqz v0, :cond_6

    .line 121
    .line 122
    move-object v0, p2

    .line 123
    check-cast v0, Ldefpackage/c91;

    .line 124
    .line 125
    iget v6, v0, Ldefpackage/c91;->p:I

    .line 126
    .line 127
    and-int v9, v6, v3

    .line 128
    .line 129
    if-eqz v9, :cond_6

    .line 130
    .line 131
    sub-int/2addr v6, v3

    .line 132
    iput v6, v0, Ldefpackage/c91;->p:I

    .line 133
    .line 134
    goto :goto_4

    .line 135
    :cond_6
    new-instance v0, Ldefpackage/c91;

    .line 136
    .line 137
    invoke-direct {v0, p0, p2}, Ldefpackage/c91;-><init>(Ldefpackage/lv0;Ldefpackage/vd0;)V

    .line 138
    .line 139
    .line 140
    :goto_4
    iget-object p2, v0, Ldefpackage/c91;->o:Ljava/lang/Object;

    .line 141
    .line 142
    iget v3, v0, Ldefpackage/c91;->p:I

    .line 143
    .line 144
    if-eqz v3, :cond_8

    .line 145
    .line 146
    if-ne v3, v4, :cond_7

    .line 147
    .line 148
    iget-object p1, v0, Ldefpackage/c91;->r:Ljava/lang/Object;

    .line 149
    .line 150
    iget-object p0, v0, Ldefpackage/c91;->n:Ldefpackage/lv0;

    .line 151
    .line 152
    invoke-static {p2}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    goto :goto_5

    .line 156
    :cond_7
    invoke-static {v1}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    move-object v2, v5

    .line 160
    goto :goto_6

    .line 161
    :cond_8
    invoke-static {p2}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    check-cast v8, Ldefpackage/wf1;

    .line 165
    .line 166
    iput-object p0, v0, Ldefpackage/c91;->n:Ldefpackage/lv0;

    .line 167
    .line 168
    iput-object p1, v0, Ldefpackage/c91;->r:Ljava/lang/Object;

    .line 169
    .line 170
    iput v4, v0, Ldefpackage/c91;->p:I

    .line 171
    .line 172
    invoke-interface {v8, p1, v0}, Ldefpackage/wf1;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object p2

    .line 176
    if-ne p2, v2, :cond_9

    .line 177
    .line 178
    goto :goto_6

    .line 179
    :cond_9
    :goto_5
    check-cast p2, Ljava/lang/Boolean;

    .line 180
    .line 181
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 182
    .line 183
    .line 184
    move-result p2

    .line 185
    if-nez p2, :cond_a

    .line 186
    .line 187
    move-object v2, v7

    .line 188
    :goto_6
    return-object v2

    .line 189
    :cond_a
    iget-object p2, p0, Ldefpackage/lv0;->p:Ljava/lang/Object;

    .line 190
    .line 191
    check-cast p2, Ldefpackage/jx3;

    .line 192
    .line 193
    iput-object p1, p2, Ldefpackage/jx3;->n:Ljava/lang/Object;

    .line 194
    .line 195
    new-instance p1, Lkotlinx/coroutines/flow/internal/AbortFlowException;

    .line 196
    .line 197
    invoke-direct {p1, p0}, Lkotlinx/coroutines/flow/internal/AbortFlowException;-><init>(Ldefpackage/q81;)V

    .line 198
    .line 199
    .line 200
    throw p1

    .line 201
    :pswitch_2
    check-cast p1, Ldefpackage/q02;

    .line 202
    .line 203
    check-cast v8, Ljava/util/ArrayList;

    .line 204
    .line 205
    instance-of p0, p1, Ldefpackage/jv0;

    .line 206
    .line 207
    if-eqz p0, :cond_b

    .line 208
    .line 209
    invoke-virtual {v8, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    goto :goto_7

    .line 213
    :cond_b
    instance-of p0, p1, Ldefpackage/kv0;

    .line 214
    .line 215
    if-eqz p0, :cond_c

    .line 216
    .line 217
    check-cast p1, Ldefpackage/kv0;

    .line 218
    .line 219
    iget-object p0, p1, Ldefpackage/kv0;->a:Ldefpackage/jv0;

    .line 220
    .line 221
    invoke-virtual {v8, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    goto :goto_7

    .line 225
    :cond_c
    instance-of p0, p1, Ldefpackage/iv0;

    .line 226
    .line 227
    if-eqz p0, :cond_d

    .line 228
    .line 229
    check-cast p1, Ldefpackage/iv0;

    .line 230
    .line 231
    iget-object p0, p1, Ldefpackage/iv0;->a:Ldefpackage/jv0;

    .line 232
    .line 233
    invoke-virtual {v8, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    :cond_d
    :goto_7
    check-cast v6, Ldefpackage/b13;

    .line 237
    .line 238
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    .line 239
    .line 240
    .line 241
    move-result p0

    .line 242
    xor-int/2addr p0, v4

    .line 243
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 244
    .line 245
    .line 246
    move-result-object p0

    .line 247
    invoke-interface {v6, p0}, Ldefpackage/b13;->setValue(Ljava/lang/Object;)V

    .line 248
    .line 249
    .line 250
    return-object v7

    .line 251
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
