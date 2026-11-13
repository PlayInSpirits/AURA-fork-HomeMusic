.class public final Ldefpackage/kn3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:Ljava/util/List;

.field public final b:Ldefpackage/gp3;

.field public c:I


# direct methods
.method public constructor <init>(Ljava/util/List;Ldefpackage/gp3;)V
    .locals 11

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/kn3;->a:Ljava/util/List;

    .line 5
    .line 6
    iput-object p2, p0, Ldefpackage/kn3;->b:Ldefpackage/gp3;

    .line 7
    .line 8
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 9
    .line 10
    const/16 v0, 0x1d

    .line 11
    .line 12
    if-lt p2, v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Ldefpackage/kn3;->a()Landroid/view/MotionEvent;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-static {v0}, Ldefpackage/ek2;->x(Landroid/view/MotionEvent;)I

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-virtual {p0}, Ldefpackage/kn3;->a()Landroid/view/MotionEvent;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getButtonState()I

    .line 30
    .line 31
    .line 32
    :cond_1
    invoke-virtual {p0}, Ldefpackage/kn3;->a()Landroid/view/MotionEvent;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getMetaState()I

    .line 39
    .line 40
    .line 41
    :cond_2
    invoke-virtual {p0}, Ldefpackage/kn3;->a()Landroid/view/MotionEvent;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    const/4 v1, 0x0

    .line 46
    const/4 v2, 0x3

    .line 47
    const/4 v3, 0x2

    .line 48
    const/4 v4, 0x1

    .line 49
    if-eqz v0, :cond_12

    .line 50
    .line 51
    const/16 p1, 0x22

    .line 52
    .line 53
    if-lt p2, p1, :cond_3

    .line 54
    .line 55
    invoke-static {v0}, Ldefpackage/ek2;->x(Landroid/view/MotionEvent;)I

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    if-ne v5, v2, :cond_3

    .line 60
    .line 61
    move v5, v4

    .line 62
    goto :goto_0

    .line 63
    :cond_3
    move v5, v1

    .line 64
    :goto_0
    const/4 v6, 0x5

    .line 65
    if-lt p2, p1, :cond_4

    .line 66
    .line 67
    invoke-static {v0}, Ldefpackage/ek2;->x(Landroid/view/MotionEvent;)I

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    if-ne p1, v6, :cond_4

    .line 72
    .line 73
    move p1, v4

    .line 74
    goto :goto_1

    .line 75
    :cond_4
    move p1, v1

    .line 76
    :goto_1
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 77
    .line 78
    .line 79
    move-result p2

    .line 80
    const/4 v0, 0x7

    .line 81
    const/16 v7, 0xa

    .line 82
    .line 83
    if-eqz p2, :cond_10

    .line 84
    .line 85
    const/16 v8, 0x9

    .line 86
    .line 87
    const/16 v9, 0xc

    .line 88
    .line 89
    if-eq p2, v4, :cond_e

    .line 90
    .line 91
    const/16 v10, 0x8

    .line 92
    .line 93
    if-eq p2, v3, :cond_b

    .line 94
    .line 95
    packed-switch p2, :pswitch_data_0

    .line 96
    .line 97
    .line 98
    goto/16 :goto_a

    .line 99
    .line 100
    :pswitch_0
    move v1, v6

    .line 101
    goto/16 :goto_a

    .line 102
    .line 103
    :pswitch_1
    const/4 v1, 0x4

    .line 104
    goto/16 :goto_a

    .line 105
    .line 106
    :pswitch_2
    const/4 v1, 0x6

    .line 107
    goto/16 :goto_a

    .line 108
    .line 109
    :pswitch_3
    if-eqz v5, :cond_5

    .line 110
    .line 111
    :goto_2
    move v1, v9

    .line 112
    goto/16 :goto_a

    .line 113
    .line 114
    :cond_5
    if-eqz p1, :cond_6

    .line 115
    .line 116
    :goto_3
    move v1, v8

    .line 117
    goto/16 :goto_a

    .line 118
    .line 119
    :cond_6
    if-eqz p1, :cond_7

    .line 120
    .line 121
    :goto_4
    move v1, v10

    .line 122
    goto :goto_a

    .line 123
    :cond_7
    :goto_5
    move v1, v3

    .line 124
    goto :goto_a

    .line 125
    :pswitch_4
    if-eqz v5, :cond_8

    .line 126
    .line 127
    :goto_6
    move v1, v7

    .line 128
    goto :goto_a

    .line 129
    :cond_8
    if-eqz p1, :cond_9

    .line 130
    .line 131
    :goto_7
    move v1, v0

    .line 132
    goto :goto_a

    .line 133
    :cond_9
    if-eqz p1, :cond_a

    .line 134
    .line 135
    goto :goto_4

    .line 136
    :cond_a
    :goto_8
    move v1, v4

    .line 137
    goto :goto_a

    .line 138
    :cond_b
    :pswitch_5
    if-eqz v5, :cond_c

    .line 139
    .line 140
    const/16 v1, 0xb

    .line 141
    .line 142
    goto :goto_a

    .line 143
    :cond_c
    if-eqz p1, :cond_d

    .line 144
    .line 145
    goto :goto_4

    .line 146
    :cond_d
    move v1, v2

    .line 147
    goto :goto_a

    .line 148
    :cond_e
    if-eqz v5, :cond_f

    .line 149
    .line 150
    goto :goto_2

    .line 151
    :cond_f
    if-eqz p1, :cond_7

    .line 152
    .line 153
    if-nez p1, :cond_7

    .line 154
    .line 155
    goto :goto_3

    .line 156
    :cond_10
    if-eqz v5, :cond_11

    .line 157
    .line 158
    goto :goto_6

    .line 159
    :cond_11
    if-eqz p1, :cond_a

    .line 160
    .line 161
    if-nez p1, :cond_a

    .line 162
    .line 163
    goto :goto_7

    .line 164
    :cond_12
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 165
    .line 166
    .line 167
    move-result p2

    .line 168
    :goto_9
    if-ge v1, p2, :cond_d

    .line 169
    .line 170
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    check-cast v0, Ldefpackage/on3;

    .line 175
    .line 176
    invoke-static {v0}, Ldefpackage/gi1;->i(Ldefpackage/on3;)Z

    .line 177
    .line 178
    .line 179
    move-result v5

    .line 180
    if-eqz v5, :cond_13

    .line 181
    .line 182
    goto :goto_5

    .line 183
    :cond_13
    invoke-static {v0}, Ldefpackage/gi1;->g(Ldefpackage/on3;)Z

    .line 184
    .line 185
    .line 186
    move-result v0

    .line 187
    if-eqz v0, :cond_14

    .line 188
    .line 189
    goto :goto_8

    .line 190
    :cond_14
    add-int/lit8 v1, v1, 0x1

    .line 191
    .line 192
    goto :goto_9

    .line 193
    :goto_a
    iput v1, p0, Ldefpackage/kn3;->c:I

    .line 194
    .line 195
    return-void

    .line 196
    nop

    .line 197
    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_4
        :pswitch_3
        :pswitch_5
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final a()Landroid/view/MotionEvent;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/kn3;->b:Ldefpackage/gp3;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/gp3;->p:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Ldefpackage/rf2;

    .line 8
    .line 9
    iget-object p0, p0, Ldefpackage/rf2;->o:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Landroid/view/MotionEvent;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return-object p0
.end method
