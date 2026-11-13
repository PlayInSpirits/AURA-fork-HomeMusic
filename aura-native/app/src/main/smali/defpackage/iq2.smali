.class public final Ldefpackage/iq2;
.super Ldefpackage/dq2;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final A:Landroid/widget/ProgressBar;

.field public final B:Landroid/widget/TextView;

.field public final C:Landroid/widget/RelativeLayout;

.field public final D:Landroid/widget/CheckBox;

.field public final E:F

.field public final F:I

.field public final G:Ldefpackage/i4;

.field public final synthetic H:Ldefpackage/jq2;

.field public final y:Landroid/view/View;

.field public final z:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(Ldefpackage/jq2;Landroid/view/View;)V
    .locals 3

    .line 1
    iput-object p1, p0, Ldefpackage/iq2;->H:Ldefpackage/jq2;

    .line 2
    .line 3
    iget-object p1, p1, Ldefpackage/jq2;->z:Ldefpackage/lq2;

    .line 4
    .line 5
    const v0, 0x7f0a03b8

    .line 6
    .line 7
    .line 8
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Landroid/widget/ImageButton;

    .line 13
    .line 14
    const v1, 0x7f0a03be

    .line 15
    .line 16
    .line 17
    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Landroidx/mediarouter/app/MediaRouteVolumeSlider;

    .line 22
    .line 23
    invoke-direct {p0, p1, p2, v0, v1}, Ldefpackage/dq2;-><init>(Ldefpackage/lq2;Landroid/view/View;Landroid/widget/ImageButton;Landroidx/mediarouter/app/MediaRouteVolumeSlider;)V

    .line 24
    .line 25
    .line 26
    new-instance v0, Ldefpackage/i4;

    .line 27
    .line 28
    const/16 v1, 0x9

    .line 29
    .line 30
    invoke-direct {v0, v1, p0}, Ldefpackage/i4;-><init>(ILjava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, Ldefpackage/iq2;->G:Ldefpackage/i4;

    .line 34
    .line 35
    iput-object p2, p0, Ldefpackage/iq2;->y:Landroid/view/View;

    .line 36
    .line 37
    const v0, 0x7f0a03b9

    .line 38
    .line 39
    .line 40
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    check-cast v0, Landroid/widget/ImageView;

    .line 45
    .line 46
    iput-object v0, p0, Ldefpackage/iq2;->z:Landroid/widget/ImageView;

    .line 47
    .line 48
    const v0, 0x7f0a03bb

    .line 49
    .line 50
    .line 51
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    check-cast v0, Landroid/widget/ProgressBar;

    .line 56
    .line 57
    iput-object v0, p0, Ldefpackage/iq2;->A:Landroid/widget/ProgressBar;

    .line 58
    .line 59
    const v1, 0x7f0a03ba

    .line 60
    .line 61
    .line 62
    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    check-cast v1, Landroid/widget/TextView;

    .line 67
    .line 68
    iput-object v1, p0, Ldefpackage/iq2;->B:Landroid/widget/TextView;

    .line 69
    .line 70
    const v1, 0x7f0a03bd

    .line 71
    .line 72
    .line 73
    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    check-cast v1, Landroid/widget/RelativeLayout;

    .line 78
    .line 79
    iput-object v1, p0, Ldefpackage/iq2;->C:Landroid/widget/RelativeLayout;

    .line 80
    .line 81
    const v1, 0x7f0a03ab

    .line 82
    .line 83
    .line 84
    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 85
    .line 86
    .line 87
    move-result-object p2

    .line 88
    check-cast p2, Landroid/widget/CheckBox;

    .line 89
    .line 90
    iput-object p2, p0, Ldefpackage/iq2;->D:Landroid/widget/CheckBox;

    .line 91
    .line 92
    iget-object p1, p1, Ldefpackage/lq2;->B:Landroid/content/Context;

    .line 93
    .line 94
    const v1, 0x7f08029f

    .line 95
    .line 96
    .line 97
    invoke-static {p1, v1}, Ldefpackage/zz1;->r(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    invoke-static {p1}, Ldefpackage/fu;->D(Landroid/content/Context;)Z

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    if-eqz v2, :cond_0

    .line 106
    .line 107
    const v2, 0x7f060315

    .line 108
    .line 109
    .line 110
    invoke-virtual {p1, v2}, Landroid/content/Context;->getColor(I)I

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    invoke-virtual {v1, v2}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    .line 115
    .line 116
    .line 117
    :cond_0
    invoke-virtual {p2, v1}, Landroid/widget/CompoundButton;->setButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 118
    .line 119
    .line 120
    invoke-static {p1, v0}, Ldefpackage/fu;->M(Landroid/content/Context;Landroid/widget/ProgressBar;)V

    .line 121
    .line 122
    .line 123
    invoke-static {p1}, Ldefpackage/fu;->v(Landroid/content/Context;)F

    .line 124
    .line 125
    .line 126
    move-result p2

    .line 127
    iput p2, p0, Ldefpackage/iq2;->E:F

    .line 128
    .line 129
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 134
    .line 135
    .line 136
    move-result-object p2

    .line 137
    new-instance v0, Landroid/util/TypedValue;

    .line 138
    .line 139
    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 140
    .line 141
    .line 142
    const v1, 0x7f070517

    .line 143
    .line 144
    .line 145
    const/4 v2, 0x1

    .line 146
    invoke-virtual {p1, v1, v0, v2}, Landroid/content/res/Resources;->getValue(ILandroid/util/TypedValue;Z)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v0, p2}, Landroid/util/TypedValue;->getDimension(Landroid/util/DisplayMetrics;)F

    .line 150
    .line 151
    .line 152
    move-result p1

    .line 153
    float-to-int p1, p1

    .line 154
    iput p1, p0, Ldefpackage/iq2;->F:I

    .line 155
    .line 156
    return-void
.end method


# virtual methods
.method public final u(Ldefpackage/wq2;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Ldefpackage/wq2;->g()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    iget-object p0, p0, Ldefpackage/iq2;->H:Ldefpackage/jq2;

    .line 9
    .line 10
    iget-object p0, p0, Ldefpackage/jq2;->z:Ldefpackage/lq2;

    .line 11
    .line 12
    iget-object p0, p0, Ldefpackage/lq2;->w:Ldefpackage/wq2;

    .line 13
    .line 14
    invoke-virtual {p0}, Ldefpackage/wq2;->a()Ldefpackage/tq2;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    if-eqz p0, :cond_2

    .line 19
    .line 20
    iget-object p0, p0, Ldefpackage/tq2;->x:Ldefpackage/oi;

    .line 21
    .line 22
    iget-object p1, p1, Ldefpackage/wq2;->c:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {p0, p1}, Ldefpackage/yd4;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    check-cast p0, Ldefpackage/mq2;

    .line 29
    .line 30
    if-eqz p0, :cond_1

    .line 31
    .line 32
    iget p0, p0, Ldefpackage/mq2;->b:I

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const/4 p0, 0x4

    .line 36
    :goto_0
    const/4 p1, 0x3

    .line 37
    if-ne p0, p1, :cond_2

    .line 38
    .line 39
    :goto_1
    const/4 p0, 0x1

    .line 40
    return p0

    .line 41
    :cond_2
    const/4 p0, 0x0

    .line 42
    return p0
.end method

.method public final v(ZZ)V
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/iq2;->D:Landroid/widget/CheckBox;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 5
    .line 6
    .line 7
    iget-object v2, p0, Ldefpackage/iq2;->y:Landroid/view/View;

    .line 8
    .line 9
    invoke-virtual {v2, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 13
    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Ldefpackage/iq2;->z:Landroid/widget/ImageView;

    .line 18
    .line 19
    const/4 v2, 0x4

    .line 20
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Ldefpackage/iq2;->A:Landroid/widget/ProgressBar;

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 26
    .line 27
    .line 28
    :cond_0
    if-eqz p2, :cond_2

    .line 29
    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    iget v1, p0, Ldefpackage/iq2;->F:I

    .line 33
    .line 34
    :cond_1
    iget-object p1, p0, Ldefpackage/iq2;->H:Ldefpackage/jq2;

    .line 35
    .line 36
    iget-object p0, p0, Ldefpackage/iq2;->C:Landroid/widget/RelativeLayout;

    .line 37
    .line 38
    invoke-virtual {p1, p0, v1}, Ldefpackage/jq2;->p(Landroid/view/View;I)V

    .line 39
    .line 40
    .line 41
    :cond_2
    return-void
.end method
