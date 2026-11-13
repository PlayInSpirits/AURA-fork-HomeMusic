.class public final Ldefpackage/tl0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/w92;


# instance fields
.field public final synthetic n:I

.field public final o:Ljava/lang/Object;

.field public final p:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 37
    iput p1, p0, Ldefpackage/tl0;->n:I

    iput-object p2, p0, Ldefpackage/tl0;->o:Ljava/lang/Object;

    iput-object p3, p0, Ldefpackage/tl0;->p:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ldefpackage/aa2;)V
    .locals 2

    .line 1
    const/4 v0, 0x5

    .line 2
    iput v0, p0, Ldefpackage/tl0;->n:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Ldefpackage/tl0;->o:Ljava/lang/Object;

    .line 8
    .line 9
    sget-object v0, Ldefpackage/l30;->c:Ldefpackage/l30;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget-object v1, v0, Ldefpackage/l30;->a:Ljava/util/HashMap;

    .line 16
    .line 17
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Ldefpackage/j30;

    .line 22
    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v1, 0x0

    .line 27
    invoke-virtual {v0, p1, v1}, Ldefpackage/l30;->a(Ljava/lang/Class;[Ljava/lang/reflect/Method;)Ldefpackage/j30;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    :goto_0
    iput-object v1, p0, Ldefpackage/tl0;->p:Ljava/lang/Object;

    .line 32
    .line 33
    return-void
.end method

.method public constructor <init>(Ldefpackage/ee1;Ldefpackage/ke1;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Ldefpackage/tl0;->n:I

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldefpackage/tl0;->p:Ljava/lang/Object;

    iput-object p2, p0, Ldefpackage/tl0;->o:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ldefpackage/rl0;Ldefpackage/w92;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ldefpackage/tl0;->n:I

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-object p1, p0, Ldefpackage/tl0;->o:Ljava/lang/Object;

    .line 36
    iput-object p2, p0, Ldefpackage/tl0;->p:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ldefpackage/u83;Ldefpackage/a93;Ldefpackage/ea2;)V
    .locals 0

    const/4 p2, 0x4

    iput p2, p0, Ldefpackage/tl0;->n:I

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput-object p1, p0, Ldefpackage/tl0;->o:Ljava/lang/Object;

    iput-object p3, p0, Ldefpackage/tl0;->p:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final b(Ldefpackage/ba2;Ldefpackage/q92;)V
    .locals 3

    .line 1
    iget v0, p0, Ldefpackage/tl0;->n:I

    .line 2
    .line 3
    iget-object v1, p0, Ldefpackage/tl0;->o:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, Ldefpackage/tl0;->p:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast v2, Ldefpackage/j30;

    .line 11
    .line 12
    iget-object p0, v2, Ldefpackage/j30;->a:Ljava/util/HashMap;

    .line 13
    .line 14
    invoke-virtual {p0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Ljava/util/List;

    .line 19
    .line 20
    invoke-static {v0, p1, p2, v1}, Ldefpackage/j30;->a(Ljava/util/List;Ldefpackage/ba2;Ldefpackage/q92;Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    sget-object v0, Ldefpackage/q92;->ON_ANY:Ldefpackage/q92;

    .line 24
    .line 25
    invoke-virtual {p0, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    check-cast p0, Ljava/util/List;

    .line 30
    .line 31
    invoke-static {p0, p1, p2, v1}, Ldefpackage/j30;->a(Ljava/util/List;Ldefpackage/ba2;Ldefpackage/q92;Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :pswitch_0
    check-cast v1, Ldefpackage/u83;

    .line 36
    .line 37
    sget-object p1, Ldefpackage/z83;->a:[I

    .line 38
    .line 39
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 40
    .line 41
    .line 42
    move-result p2

    .line 43
    aget p1, p1, p2

    .line 44
    .line 45
    const/4 p2, 0x1

    .line 46
    if-eq p1, p2, :cond_2

    .line 47
    .line 48
    const/4 p2, 0x2

    .line 49
    if-eq p1, p2, :cond_1

    .line 50
    .line 51
    const/4 p2, 0x3

    .line 52
    if-eq p1, p2, :cond_0

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    invoke-virtual {v1}, Ldefpackage/u83;->a()V

    .line 56
    .line 57
    .line 58
    check-cast v2, Ldefpackage/ea2;

    .line 59
    .line 60
    invoke-virtual {v2, p0}, Ldefpackage/ea2;->f(Ldefpackage/aa2;)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    const/4 p0, 0x0

    .line 65
    invoke-virtual {v1, p0}, Ldefpackage/u83;->b(Z)V

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_2
    invoke-virtual {v1, p2}, Ldefpackage/u83;->b(Z)V

    .line 70
    .line 71
    .line 72
    :goto_0
    return-void

    .line 73
    :pswitch_1
    sget-object p1, Ldefpackage/q92;->ON_START:Ldefpackage/q92;

    .line 74
    .line 75
    if-ne p2, p1, :cond_3

    .line 76
    .line 77
    check-cast v1, Ldefpackage/ea2;

    .line 78
    .line 79
    invoke-virtual {v1, p0}, Ldefpackage/ea2;->f(Ldefpackage/aa2;)V

    .line 80
    .line 81
    .line 82
    check-cast v2, Ldefpackage/rm3;

    .line 83
    .line 84
    invoke-virtual {v2}, Ldefpackage/rm3;->P()V

    .line 85
    .line 86
    .line 87
    :cond_3
    return-void

    .line 88
    :pswitch_2
    sget-object v0, Ldefpackage/q92;->ON_DESTROY:Ldefpackage/q92;

    .line 89
    .line 90
    if-ne p2, v0, :cond_4

    .line 91
    .line 92
    check-cast v1, Landroid/os/Handler;

    .line 93
    .line 94
    check-cast v2, Ldefpackage/g5;

    .line 95
    .line 96
    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 97
    .line 98
    .line 99
    invoke-interface {p1}, Ldefpackage/ba2;->h()Ldefpackage/ea2;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-virtual {p1, p0}, Ldefpackage/ea2;->f(Ldefpackage/aa2;)V

    .line 104
    .line 105
    .line 106
    :cond_4
    return-void

    .line 107
    :pswitch_3
    check-cast v1, Ldefpackage/ke1;

    .line 108
    .line 109
    check-cast v2, Ldefpackage/ee1;

    .line 110
    .line 111
    iget-object p2, v2, Ldefpackage/ee1;->r:Ldefpackage/ld1;

    .line 112
    .line 113
    invoke-virtual {p2}, Ldefpackage/ld1;->N()Z

    .line 114
    .line 115
    .line 116
    move-result p2

    .line 117
    if-eqz p2, :cond_5

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_5
    invoke-interface {p1}, Ldefpackage/ba2;->h()Ldefpackage/ea2;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    invoke-virtual {p1, p0}, Ldefpackage/ea2;->f(Ldefpackage/aa2;)V

    .line 125
    .line 126
    .line 127
    iget-object p0, v1, Ldefpackage/cx3;->a:Landroid/view/View;

    .line 128
    .line 129
    check-cast p0, Landroid/widget/FrameLayout;

    .line 130
    .line 131
    sget-object p1, Ldefpackage/j65;->a:Ljava/util/WeakHashMap;

    .line 132
    .line 133
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 134
    .line 135
    .line 136
    move-result p0

    .line 137
    if-eqz p0, :cond_6

    .line 138
    .line 139
    invoke-virtual {v2, v1}, Ldefpackage/ee1;->u(Ldefpackage/ke1;)V

    .line 140
    .line 141
    .line 142
    :cond_6
    :goto_1
    return-void

    .line 143
    :pswitch_4
    check-cast v1, Ldefpackage/rl0;

    .line 144
    .line 145
    sget-object p0, Ldefpackage/sl0;->a:[I

    .line 146
    .line 147
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 148
    .line 149
    .line 150
    move-result v0

    .line 151
    aget p0, p0, v0

    .line 152
    .line 153
    packed-switch p0, :pswitch_data_1

    .line 154
    .line 155
    .line 156
    invoke-static {}, Ldefpackage/er1;->n()V

    .line 157
    .line 158
    .line 159
    goto :goto_3

    .line 160
    :pswitch_5
    const-string p0, "ON_ANY must not been send by anybody"

    .line 161
    .line 162
    invoke-static {p0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    goto :goto_3

    .line 166
    :pswitch_6
    invoke-interface {v1, p1}, Ldefpackage/rl0;->onDestroy(Ldefpackage/ba2;)V

    .line 167
    .line 168
    .line 169
    goto :goto_2

    .line 170
    :pswitch_7
    invoke-interface {v1, p1}, Ldefpackage/rl0;->onStop(Ldefpackage/ba2;)V

    .line 171
    .line 172
    .line 173
    goto :goto_2

    .line 174
    :pswitch_8
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    goto :goto_2

    .line 178
    :pswitch_9
    invoke-interface {v1, p1}, Ldefpackage/rl0;->j(Ldefpackage/ba2;)V

    .line 179
    .line 180
    .line 181
    goto :goto_2

    .line 182
    :pswitch_a
    invoke-interface {v1, p1}, Ldefpackage/rl0;->onStart(Ldefpackage/ba2;)V

    .line 183
    .line 184
    .line 185
    goto :goto_2

    .line 186
    :pswitch_b
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    :goto_2
    check-cast v2, Ldefpackage/w92;

    .line 190
    .line 191
    if-eqz v2, :cond_7

    .line 192
    .line 193
    invoke-interface {v2, p1, p2}, Ldefpackage/w92;->b(Ldefpackage/ba2;Ldefpackage/q92;)V

    .line 194
    .line 195
    .line 196
    :cond_7
    :goto_3
    return-void

    .line 197
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 198
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
    .end packed-switch
.end method
