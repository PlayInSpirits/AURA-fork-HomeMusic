.class public final Li20;
.super Landroid/view/ViewOutlineProvider;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Li20;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Li20;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/view/ViewOutlineProvider;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final getOutline(Landroid/view/View;Landroid/graphics/Outline;)V
    .locals 7

    .line 1
    iget p1, p0, Li20;->a:I

    .line 2
    .line 3
    iget-object p0, p0, Li20;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Loc4;

    .line 9
    .line 10
    iget-object p0, p0, Lmc4;->e:Landroid/graphics/Path;

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/graphics/Path;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    invoke-static {p2, p0}, Ll3;->u(Landroid/graphics/Outline;Landroid/graphics/Path;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void

    .line 22
    :pswitch_0
    check-cast p0, Lnc4;

    .line 23
    .line 24
    iget-object p1, p0, Lmc4;->c:Lbc4;

    .line 25
    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    iget-object p1, p0, Lmc4;->d:Landroid/graphics/RectF;

    .line 29
    .line 30
    invoke-virtual {p1}, Landroid/graphics/RectF;->isEmpty()Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-nez p1, :cond_1

    .line 35
    .line 36
    iget-object p1, p0, Lmc4;->d:Landroid/graphics/RectF;

    .line 37
    .line 38
    iget v0, p1, Landroid/graphics/RectF;->left:F

    .line 39
    .line 40
    float-to-int v2, v0

    .line 41
    iget v0, p1, Landroid/graphics/RectF;->top:F

    .line 42
    .line 43
    float-to-int v3, v0

    .line 44
    iget v0, p1, Landroid/graphics/RectF;->right:F

    .line 45
    .line 46
    float-to-int v4, v0

    .line 47
    iget p1, p1, Landroid/graphics/RectF;->bottom:F

    .line 48
    .line 49
    float-to-int v5, p1

    .line 50
    iget v6, p0, Lnc4;->g:F

    .line 51
    .line 52
    move-object v1, p2

    .line 53
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Outline;->setRoundRect(IIIIF)V

    .line 54
    .line 55
    .line 56
    :cond_1
    return-void

    .line 57
    :pswitch_1
    move-object v1, p2

    .line 58
    check-cast p0, Lcom/google/android/material/chip/Chip;

    .line 59
    .line 60
    iget-object p0, p0, Lcom/google/android/material/chip/Chip;->r:Lk20;

    .line 61
    .line 62
    if-eqz p0, :cond_2

    .line 63
    .line 64
    invoke-virtual {p0, v1}, Lk20;->getOutline(Landroid/graphics/Outline;)V

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_2
    const/4 p0, 0x0

    .line 69
    invoke-virtual {v1, p0}, Landroid/graphics/Outline;->setAlpha(F)V

    .line 70
    .line 71
    .line 72
    :goto_0
    return-void

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
