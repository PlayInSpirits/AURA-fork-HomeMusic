.class public final Loj3;
.super Landroid/animation/AnimatorListenerAdapter;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lqj3;


# direct methods
.method public synthetic constructor <init>(Lqj3;I)V
    .locals 0

    .line 1
    iput p2, p0, Loj3;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Loj3;->b:Lqj3;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 4

    .line 1
    iget v0, p0, Loj3;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x4

    .line 5
    iget-object v3, p0, Loj3;->b:Lqj3;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    :pswitch_0
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationEnd(Landroid/animation/Animator;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_1
    iget-object p0, v3, Lqj3;->i:Landroid/view/ViewGroup;

    .line 15
    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void

    .line 22
    :pswitch_2
    iget-object p0, v3, Lqj3;->g:Landroid/view/ViewGroup;

    .line 23
    .line 24
    if-eqz p0, :cond_1

    .line 25
    .line 26
    invoke-virtual {p0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 27
    .line 28
    .line 29
    :cond_1
    return-void

    .line 30
    :pswitch_3
    invoke-virtual {v3, v1}, Lqj3;->i(I)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :pswitch_4
    invoke-virtual {v3, v1}, Lqj3;->i(I)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :pswitch_5
    iget-object p0, v3, Lqj3;->b:Landroid/view/View;

    .line 39
    .line 40
    if-eqz p0, :cond_2

    .line 41
    .line 42
    invoke-virtual {p0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 43
    .line 44
    .line 45
    :cond_2
    iget-object p0, v3, Lqj3;->c:Landroid/view/ViewGroup;

    .line 46
    .line 47
    if-eqz p0, :cond_3

    .line 48
    .line 49
    invoke-virtual {p0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 50
    .line 51
    .line 52
    :cond_3
    iget-object p0, v3, Lqj3;->d:Landroid/view/ViewGroup;

    .line 53
    .line 54
    if-eqz p0, :cond_4

    .line 55
    .line 56
    invoke-virtual {p0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 57
    .line 58
    .line 59
    :cond_4
    iget-object p0, v3, Lqj3;->f:Landroid/view/ViewGroup;

    .line 60
    .line 61
    if-eqz p0, :cond_5

    .line 62
    .line 63
    invoke-virtual {p0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 64
    .line 65
    .line 66
    :cond_5
    return-void

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public final onAnimationStart(Landroid/animation/Animator;)V
    .locals 7

    .line 1
    iget p1, p0, Loj3;->a:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    const/4 v1, 0x2

    .line 5
    const-wide/16 v2, 0xfa

    .line 6
    .line 7
    const/4 v4, 0x4

    .line 8
    const/4 v5, 0x0

    .line 9
    iget-object p0, p0, Loj3;->b:Lqj3;

    .line 10
    .line 11
    packed-switch p1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, Lqj3;->g:Landroid/view/ViewGroup;

    .line 15
    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0, v5}, Landroid/view/View;->setVisibility(I)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void

    .line 22
    :pswitch_0
    iget-object p0, p0, Lqj3;->i:Landroid/view/ViewGroup;

    .line 23
    .line 24
    if-eqz p0, :cond_1

    .line 25
    .line 26
    invoke-virtual {p0, v5}, Landroid/view/View;->setVisibility(I)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    int-to-float p1, p1

    .line 34
    invoke-virtual {p0, p1}, Landroid/view/View;->setTranslationX(F)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    invoke-virtual {p0, p1, v5}, Landroid/view/View;->scrollTo(II)V

    .line 42
    .line 43
    .line 44
    :cond_1
    return-void

    .line 45
    :pswitch_1
    invoke-virtual {p0, v4}, Lqj3;->i(I)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :pswitch_2
    invoke-virtual {p0, v4}, Lqj3;->i(I)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :pswitch_3
    iget-object p1, p0, Lqj3;->b:Landroid/view/View;

    .line 54
    .line 55
    if-eqz p1, :cond_2

    .line 56
    .line 57
    invoke-virtual {p1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 58
    .line 59
    .line 60
    :cond_2
    iget-object p1, p0, Lqj3;->c:Landroid/view/ViewGroup;

    .line 61
    .line 62
    if-eqz p1, :cond_3

    .line 63
    .line 64
    invoke-virtual {p1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 65
    .line 66
    .line 67
    :cond_3
    iget-object p1, p0, Lqj3;->d:Landroid/view/ViewGroup;

    .line 68
    .line 69
    if-eqz p1, :cond_4

    .line 70
    .line 71
    invoke-virtual {p1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 72
    .line 73
    .line 74
    :cond_4
    iget-object p1, p0, Lqj3;->f:Landroid/view/ViewGroup;

    .line 75
    .line 76
    if-eqz p1, :cond_6

    .line 77
    .line 78
    iget-boolean v6, p0, Lqj3;->B:Z

    .line 79
    .line 80
    if-eqz v6, :cond_5

    .line 81
    .line 82
    move v4, v5

    .line 83
    :cond_5
    invoke-virtual {p1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 84
    .line 85
    .line 86
    :cond_6
    iget-object p1, p0, Lqj3;->k:Landroid/view/View;

    .line 87
    .line 88
    instance-of v4, p1, Landroidx/media3/ui/DefaultTimeBar;

    .line 89
    .line 90
    if-eqz v4, :cond_8

    .line 91
    .line 92
    iget-boolean p0, p0, Lqj3;->B:Z

    .line 93
    .line 94
    if-nez p0, :cond_8

    .line 95
    .line 96
    check-cast p1, Landroidx/media3/ui/DefaultTimeBar;

    .line 97
    .line 98
    iget-object p0, p1, Landroidx/media3/ui/DefaultTimeBar;->R:Landroid/animation/ValueAnimator;

    .line 99
    .line 100
    invoke-virtual {p0}, Landroid/animation/ValueAnimator;->isStarted()Z

    .line 101
    .line 102
    .line 103
    move-result v4

    .line 104
    if-eqz v4, :cond_7

    .line 105
    .line 106
    invoke-virtual {p0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 107
    .line 108
    .line 109
    :cond_7
    iput-boolean v5, p1, Landroidx/media3/ui/DefaultTimeBar;->T:Z

    .line 110
    .line 111
    iget p1, p1, Landroidx/media3/ui/DefaultTimeBar;->S:F

    .line 112
    .line 113
    new-array v1, v1, [F

    .line 114
    .line 115
    aput p1, v1, v5

    .line 116
    .line 117
    const/high16 p1, 0x3f800000    # 1.0f

    .line 118
    .line 119
    aput p1, v1, v0

    .line 120
    .line 121
    invoke-virtual {p0, v1}, Landroid/animation/ValueAnimator;->setFloatValues([F)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p0, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 125
    .line 126
    .line 127
    invoke-virtual {p0}, Landroid/animation/ValueAnimator;->start()V

    .line 128
    .line 129
    .line 130
    :cond_8
    return-void

    .line 131
    :pswitch_4
    iget-object p1, p0, Lqj3;->k:Landroid/view/View;

    .line 132
    .line 133
    instance-of v4, p1, Landroidx/media3/ui/DefaultTimeBar;

    .line 134
    .line 135
    if-eqz v4, :cond_a

    .line 136
    .line 137
    iget-boolean p0, p0, Lqj3;->B:Z

    .line 138
    .line 139
    if-nez p0, :cond_a

    .line 140
    .line 141
    check-cast p1, Landroidx/media3/ui/DefaultTimeBar;

    .line 142
    .line 143
    iget-object p0, p1, Landroidx/media3/ui/DefaultTimeBar;->R:Landroid/animation/ValueAnimator;

    .line 144
    .line 145
    invoke-virtual {p0}, Landroid/animation/ValueAnimator;->isStarted()Z

    .line 146
    .line 147
    .line 148
    move-result v4

    .line 149
    if-eqz v4, :cond_9

    .line 150
    .line 151
    invoke-virtual {p0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 152
    .line 153
    .line 154
    :cond_9
    iget p1, p1, Landroidx/media3/ui/DefaultTimeBar;->S:F

    .line 155
    .line 156
    new-array v1, v1, [F

    .line 157
    .line 158
    aput p1, v1, v5

    .line 159
    .line 160
    const/4 p1, 0x0

    .line 161
    aput p1, v1, v0

    .line 162
    .line 163
    invoke-virtual {p0, v1}, Landroid/animation/ValueAnimator;->setFloatValues([F)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {p0, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 167
    .line 168
    .line 169
    invoke-virtual {p0}, Landroid/animation/ValueAnimator;->start()V

    .line 170
    .line 171
    .line 172
    :cond_a
    return-void

    .line 173
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
