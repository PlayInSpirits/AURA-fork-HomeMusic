.class public final Lp43;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lou2;
.implements Lr83;


# instance fields
.field public final synthetic n:Lcom/google/android/material/navigation/NavigationView;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/material/navigation/NavigationView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lp43;->n:Lcom/google/android/material/navigation/NavigationView;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public m(Lqu2;Landroid/view/MenuItem;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lp43;->n:Lcom/google/android/material/navigation/NavigationView;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->w:Lq43;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-interface {p0, p2}, Lq43;->a(Landroid/view/MenuItem;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return p0
.end method

.method public x(Landroid/view/View;Lpb5;)Lpb5;
    .locals 5

    .line 1
    iget-object p0, p0, Lp43;->n:Lcom/google/android/material/navigation/NavigationView;

    .line 2
    .line 3
    iget-object p1, p0, Lf64;->o:Landroid/graphics/Rect;

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    new-instance p1, Landroid/graphics/Rect;

    .line 8
    .line 9
    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lf64;->o:Landroid/graphics/Rect;

    .line 13
    .line 14
    :cond_0
    iget-object p1, p0, Lf64;->o:Landroid/graphics/Rect;

    .line 15
    .line 16
    invoke-virtual {p2}, Lpb5;->b()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    iget-object v1, p2, Lpb5;->a:Lmb5;

    .line 21
    .line 22
    invoke-virtual {p2}, Lpb5;->d()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    invoke-virtual {p2}, Lpb5;->c()I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    invoke-virtual {p2}, Lpb5;->a()I

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    invoke-virtual {p1, v0, v2, v3, v4}, Landroid/graphics/Rect;->set(IIII)V

    .line 35
    .line 36
    .line 37
    iget-object p1, p0, Lcom/google/android/material/navigation/NavigationView;->v:Ll43;

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p2}, Lpb5;->d()I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget v2, p1, Ll43;->M:I

    .line 47
    .line 48
    const/4 v3, 0x0

    .line 49
    if-eq v2, v0, :cond_3

    .line 50
    .line 51
    iput v0, p1, Ll43;->M:I

    .line 52
    .line 53
    iget-object v0, p1, Ll43;->o:Landroid/widget/LinearLayout;

    .line 54
    .line 55
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-lez v0, :cond_1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    iget-boolean v0, p1, Ll43;->K:Z

    .line 63
    .line 64
    if-eqz v0, :cond_2

    .line 65
    .line 66
    iget v0, p1, Ll43;->M:I

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_2
    :goto_0
    move v0, v3

    .line 70
    :goto_1
    iget-object v2, p1, Ll43;->n:Lcom/google/android/material/internal/NavigationMenuView;

    .line 71
    .line 72
    invoke-virtual {v2}, Landroid/view/View;->getPaddingBottom()I

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    invoke-virtual {v2, v3, v0, v3, v4}, Landroid/view/View;->setPadding(IIII)V

    .line 77
    .line 78
    .line 79
    :cond_3
    iget-object v0, p1, Ll43;->n:Lcom/google/android/material/internal/NavigationMenuView;

    .line 80
    .line 81
    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    invoke-virtual {p2}, Lpb5;->a()I

    .line 86
    .line 87
    .line 88
    move-result v4

    .line 89
    invoke-virtual {v0, v3, v2, v3, v4}, Landroid/view/View;->setPadding(IIII)V

    .line 90
    .line 91
    .line 92
    iget-object p1, p1, Ll43;->o:Landroid/widget/LinearLayout;

    .line 93
    .line 94
    invoke-static {p1, p2}, Lj65;->b(Landroid/view/View;Lpb5;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v1}, Lmb5;->m()Lvz1;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    sget-object p2, Lvz1;->e:Lvz1;

    .line 102
    .line 103
    invoke-virtual {p1, p2}, Lvz1;->equals(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    if-nez p1, :cond_4

    .line 108
    .line 109
    iget-object p1, p0, Lf64;->n:Landroid/graphics/drawable/Drawable;

    .line 110
    .line 111
    if-nez p1, :cond_5

    .line 112
    .line 113
    :cond_4
    const/4 v3, 0x1

    .line 114
    :cond_5
    invoke-virtual {p0, v3}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v1}, Lmb5;->c()Lpb5;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    return-object p0
.end method

.method public y(Lqu2;)V
    .locals 0

    .line 1
    return-void
.end method
