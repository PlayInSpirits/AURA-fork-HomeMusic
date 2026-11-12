.class public final Lcat/ereza/customactivityoncrash/activity/DefaultErrorActivity;
.super Ldf;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final synthetic N:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ldf;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Lnc1;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    sget-object p1, Lft3;->a:[I

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const/16 v0, 0x75

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    const v0, 0x7f14028a

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v0}, Ldf;->setTheme(I)V

    .line 22
    .line 23
    .line 24
    :cond_0
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 25
    .line 26
    .line 27
    const p1, 0x7f0d002d

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, p1}, Ldf;->setContentView(I)V

    .line 31
    .line 32
    .line 33
    const p1, 0x7f0a0194

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, p1}, Ldf;->findViewById(I)Landroid/view/View;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast p1, Landroid/widget/Button;

    .line 41
    .line 42
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-static {v0}, Lsg0;->c(Landroid/content/Intent;)Loz;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    if-nez v0, :cond_1

    .line 51
    .line 52
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_1
    iget-object v1, v0, Loz;->p:Ljava/lang/Class;

    .line 57
    .line 58
    if-eqz v1, :cond_2

    .line 59
    .line 60
    const v1, 0x7f1300d3

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(I)V

    .line 64
    .line 65
    .line 66
    new-instance v1, Lj8;

    .line 67
    .line 68
    const/4 v2, 0x7

    .line 69
    invoke-direct {v1, v2, p0, v0}, Lj8;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_2
    new-instance v1, Lok0;

    .line 77
    .line 78
    invoke-direct {v1, p0, v0}, Lok0;-><init>(Lcat/ereza/customactivityoncrash/activity/DefaultErrorActivity;Loz;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 82
    .line 83
    .line 84
    :goto_0
    const p1, 0x7f0a0193

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0, p1}, Ldf;->findViewById(I)Landroid/view/View;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    check-cast p1, Landroid/widget/Button;

    .line 92
    .line 93
    new-instance v1, Lok0;

    .line 94
    .line 95
    invoke-direct {v1, p0}, Lok0;-><init>(Lcat/ereza/customactivityoncrash/activity/DefaultErrorActivity;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 99
    .line 100
    .line 101
    iget-object p1, v0, Loz;->n:Ljava/lang/Integer;

    .line 102
    .line 103
    const v0, 0x7f0a0192

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0, v0}, Ldf;->findViewById(I)Landroid/view/View;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    check-cast v0, Landroid/widget/ImageView;

    .line 111
    .line 112
    if-eqz p1, :cond_3

    .line 113
    .line 114
    invoke-virtual {p0}, Ldf;->getResources()Landroid/content/res/Resources;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 119
    .line 120
    .line 121
    move-result p1

    .line 122
    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    sget-object v2, Lg14;->a:Ljava/lang/ThreadLocal;

    .line 127
    .line 128
    invoke-virtual {v1, p1, p0}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 133
    .line 134
    .line 135
    :cond_3
    return-void
.end method
