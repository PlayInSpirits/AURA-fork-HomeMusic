.class public final Ldefpackage/tl;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:Ldefpackage/go4;

.field public final b:Landroid/os/Handler;

.field public c:Ldefpackage/q41;

.field public d:Ldefpackage/il;

.field public e:I

.field public f:I

.field public g:F

.field public h:Ldefpackage/wl;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Ldefpackage/q41;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/high16 v0, 0x3f800000    # 1.0f

    .line 5
    .line 6
    iput v0, p0, Ldefpackage/tl;->g:F

    .line 7
    .line 8
    new-instance v0, Ldefpackage/sl;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {v0, v1, p1}, Ldefpackage/sl;-><init>(ILjava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Ldefpackage/au0;->L(Ldefpackage/go4;)Ldefpackage/go4;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iput-object p1, p0, Ldefpackage/tl;->a:Ldefpackage/go4;

    .line 19
    .line 20
    iput-object p3, p0, Ldefpackage/tl;->c:Ldefpackage/q41;

    .line 21
    .line 22
    new-instance p1, Landroid/os/Handler;

    .line 23
    .line 24
    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, Ldefpackage/tl;->b:Landroid/os/Handler;

    .line 28
    .line 29
    iput v1, p0, Ldefpackage/tl;->e:I

    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    iget v0, p0, Ldefpackage/tl;->e:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eq v0, v1, :cond_2

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    iget-object v0, p0, Ldefpackage/tl;->h:Ldefpackage/wl;

    .line 10
    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    iget-object v0, p0, Ldefpackage/tl;->a:Ldefpackage/go4;

    .line 14
    .line 15
    invoke-interface {v0}, Ldefpackage/go4;->get()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Landroid/media/AudioManager;

    .line 20
    .line 21
    iget-object p0, p0, Ldefpackage/tl;->h:Ldefpackage/wl;

    .line 22
    .line 23
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 24
    .line 25
    const/16 v2, 0x1a

    .line 26
    .line 27
    if-lt v1, v2, :cond_1

    .line 28
    .line 29
    iget-object p0, p0, Ldefpackage/wl;->f:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-static {p0}, Ldefpackage/j3;->k(Ljava/lang/Object;)Landroid/media/AudioFocusRequest;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-static {v0, p0}, Ldefpackage/j3;->b(Landroid/media/AudioManager;Landroid/media/AudioFocusRequest;)I

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_1
    iget-object p0, p0, Ldefpackage/wl;->b:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    .line 43
    .line 44
    invoke-virtual {v0, p0}, Landroid/media/AudioManager;->abandonAudioFocus(Landroid/media/AudioManager$OnAudioFocusChangeListener;)I

    .line 45
    .line 46
    .line 47
    :cond_2
    :goto_0
    return-void
.end method

.method public final b(I)V
    .locals 1

    .line 1
    iget v0, p0, Ldefpackage/tl;->e:I

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    iput p1, p0, Ldefpackage/tl;->e:I

    .line 7
    .line 8
    const/4 v0, 0x4

    .line 9
    if-ne p1, v0, :cond_1

    .line 10
    .line 11
    const p1, 0x3e4ccccd    # 0.2f

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    const/high16 p1, 0x3f800000    # 1.0f

    .line 16
    .line 17
    :goto_0
    iget v0, p0, Ldefpackage/tl;->g:F

    .line 18
    .line 19
    cmpl-float v0, v0, p1

    .line 20
    .line 21
    if-nez v0, :cond_2

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_2
    iput p1, p0, Ldefpackage/tl;->g:F

    .line 25
    .line 26
    iget-object p0, p0, Ldefpackage/tl;->c:Ldefpackage/q41;

    .line 27
    .line 28
    if-eqz p0, :cond_3

    .line 29
    .line 30
    iget-object p0, p0, Ldefpackage/q41;->u:Ldefpackage/yp4;

    .line 31
    .line 32
    const/16 p1, 0x22

    .line 33
    .line 34
    invoke-virtual {p0, p1}, Ldefpackage/yp4;->g(I)V

    .line 35
    .line 36
    .line 37
    :cond_3
    :goto_1
    return-void
.end method

.method public final c(IZ)I
    .locals 12

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    if-eq p1, v1, :cond_a

    .line 4
    .line 5
    iget p1, p0, Ldefpackage/tl;->f:I

    .line 6
    .line 7
    if-ne p1, v1, :cond_a

    .line 8
    .line 9
    iget v2, p0, Ldefpackage/tl;->e:I

    .line 10
    .line 11
    const/4 v3, 0x3

    .line 12
    const/4 v4, -0x1

    .line 13
    if-eqz p2, :cond_7

    .line 14
    .line 15
    const/4 p2, 0x2

    .line 16
    if-ne v2, p2, :cond_0

    .line 17
    .line 18
    goto/16 :goto_5

    .line 19
    .line 20
    :cond_0
    iget-object v2, p0, Ldefpackage/tl;->h:Ldefpackage/wl;

    .line 21
    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    goto :goto_2

    .line 25
    :cond_1
    if-nez v2, :cond_2

    .line 26
    .line 27
    new-instance v2, Ldefpackage/i;

    .line 28
    .line 29
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 30
    .line 31
    .line 32
    sget-object v5, Ldefpackage/il;->i:Ldefpackage/il;

    .line 33
    .line 34
    iput-object v5, v2, Ldefpackage/i;->c:Ljava/lang/Object;

    .line 35
    .line 36
    iput p1, v2, Ldefpackage/i;->a:I

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    new-instance p1, Ldefpackage/i;

    .line 40
    .line 41
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 42
    .line 43
    .line 44
    iget v5, v2, Ldefpackage/wl;->a:I

    .line 45
    .line 46
    iput v5, p1, Ldefpackage/i;->a:I

    .line 47
    .line 48
    iget-object v5, v2, Ldefpackage/wl;->d:Ldefpackage/il;

    .line 49
    .line 50
    iput-object v5, p1, Ldefpackage/i;->c:Ljava/lang/Object;

    .line 51
    .line 52
    iget-boolean v2, v2, Ldefpackage/wl;->e:Z

    .line 53
    .line 54
    iput-boolean v2, p1, Ldefpackage/i;->b:Z

    .line 55
    .line 56
    move-object v2, p1

    .line 57
    :goto_0
    iget-object p1, p0, Ldefpackage/tl;->d:Ldefpackage/il;

    .line 58
    .line 59
    if-eqz p1, :cond_3

    .line 60
    .line 61
    iget v5, p1, Ldefpackage/il;->a:I

    .line 62
    .line 63
    if-ne v5, v1, :cond_3

    .line 64
    .line 65
    move v5, v1

    .line 66
    goto :goto_1

    .line 67
    :cond_3
    move v5, v0

    .line 68
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    iput-object p1, v2, Ldefpackage/i;->c:Ljava/lang/Object;

    .line 72
    .line 73
    iput-boolean v5, v2, Ldefpackage/i;->b:Z

    .line 74
    .line 75
    new-instance v8, Ldefpackage/rl;

    .line 76
    .line 77
    invoke-direct {v8, p0}, Ldefpackage/rl;-><init>(Ldefpackage/tl;)V

    .line 78
    .line 79
    .line 80
    iget-object v9, p0, Ldefpackage/tl;->b:Landroid/os/Handler;

    .line 81
    .line 82
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    new-instance v6, Ldefpackage/wl;

    .line 86
    .line 87
    iget v7, v2, Ldefpackage/i;->a:I

    .line 88
    .line 89
    iget-object p1, v2, Ldefpackage/i;->c:Ljava/lang/Object;

    .line 90
    .line 91
    move-object v10, p1

    .line 92
    check-cast v10, Ldefpackage/il;

    .line 93
    .line 94
    iget-boolean v11, v2, Ldefpackage/i;->b:Z

    .line 95
    .line 96
    invoke-direct/range {v6 .. v11}, Ldefpackage/wl;-><init>(ILandroid/media/AudioManager$OnAudioFocusChangeListener;Landroid/os/Handler;Ldefpackage/il;Z)V

    .line 97
    .line 98
    .line 99
    iput-object v6, p0, Ldefpackage/tl;->h:Ldefpackage/wl;

    .line 100
    .line 101
    :goto_2
    iget-object p1, p0, Ldefpackage/tl;->a:Ldefpackage/go4;

    .line 102
    .line 103
    invoke-interface {p1}, Ldefpackage/go4;->get()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    check-cast p1, Landroid/media/AudioManager;

    .line 108
    .line 109
    iget-object v2, p0, Ldefpackage/tl;->h:Ldefpackage/wl;

    .line 110
    .line 111
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 112
    .line 113
    const/16 v6, 0x1a

    .line 114
    .line 115
    if-lt v5, v6, :cond_4

    .line 116
    .line 117
    iget-object v0, v2, Ldefpackage/wl;->f:Ljava/lang/Object;

    .line 118
    .line 119
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    invoke-static {v0}, Ldefpackage/j3;->k(Ljava/lang/Object;)Landroid/media/AudioFocusRequest;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-static {p1, v0}, Ldefpackage/j3;->C(Landroid/media/AudioManager;Landroid/media/AudioFocusRequest;)I

    .line 127
    .line 128
    .line 129
    move-result p1

    .line 130
    goto :goto_4

    .line 131
    :cond_4
    iget-object v5, v2, Ldefpackage/wl;->b:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    .line 132
    .line 133
    iget-object v6, v2, Ldefpackage/wl;->d:Ldefpackage/il;

    .line 134
    .line 135
    iget v7, v6, Ldefpackage/il;->b:I

    .line 136
    .line 137
    and-int/2addr v7, v1

    .line 138
    if-ne v7, v1, :cond_5

    .line 139
    .line 140
    :pswitch_0
    move v0, v1

    .line 141
    goto :goto_3

    .line 142
    :cond_5
    iget v6, v6, Ldefpackage/il;->c:I

    .line 143
    .line 144
    packed-switch v6, :pswitch_data_0

    .line 145
    .line 146
    .line 147
    :pswitch_1
    move v0, v3

    .line 148
    goto :goto_3

    .line 149
    :pswitch_2
    const/16 v0, 0xa

    .line 150
    .line 151
    goto :goto_3

    .line 152
    :pswitch_3
    move v0, p2

    .line 153
    goto :goto_3

    .line 154
    :pswitch_4
    const/4 v0, 0x5

    .line 155
    goto :goto_3

    .line 156
    :pswitch_5
    const/4 v0, 0x4

    .line 157
    goto :goto_3

    .line 158
    :pswitch_6
    const/16 v0, 0x8

    .line 159
    .line 160
    :goto_3
    :pswitch_7
    iget v2, v2, Ldefpackage/wl;->a:I

    .line 161
    .line 162
    invoke-virtual {p1, v5, v0, v2}, Landroid/media/AudioManager;->requestAudioFocus(Landroid/media/AudioManager$OnAudioFocusChangeListener;II)I

    .line 163
    .line 164
    .line 165
    move-result p1

    .line 166
    :goto_4
    if-ne p1, v1, :cond_6

    .line 167
    .line 168
    invoke-virtual {p0, p2}, Ldefpackage/tl;->b(I)V

    .line 169
    .line 170
    .line 171
    return v1

    .line 172
    :cond_6
    invoke-virtual {p0, v1}, Ldefpackage/tl;->b(I)V

    .line 173
    .line 174
    .line 175
    return v4

    .line 176
    :cond_7
    if-eq v2, v1, :cond_9

    .line 177
    .line 178
    if-eq v2, v3, :cond_8

    .line 179
    .line 180
    :goto_5
    return v1

    .line 181
    :cond_8
    return v0

    .line 182
    :cond_9
    return v4

    .line 183
    :cond_a
    invoke-virtual {p0}, Ldefpackage/tl;->a()V

    .line 184
    .line 185
    .line 186
    invoke-virtual {p0, v0}, Ldefpackage/tl;->b(I)V

    .line 187
    .line 188
    .line 189
    return v1

    .line 190
    nop

    .line 191
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
