.class public final Lib3;
.super Lqz0;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(Lmw3;I)V
    .locals 0

    .line 1
    iput p2, p0, Lib3;->d:I

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lqz0;-><init>(Lmw3;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final d(Landroid/view/View;)I
    .locals 1

    .line 1
    iget v0, p0, Lib3;->d:I

    .line 2
    .line 3
    iget-object p0, p0, Lqz0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lnw3;

    .line 13
    .line 14
    check-cast p0, Lmw3;

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-static {p1}, Lmw3;->y(Landroid/view/View;)I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    iget p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 24
    .line 25
    :goto_0
    add-int/2addr p0, p1

    .line 26
    return p0

    .line 27
    :pswitch_0
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Lnw3;

    .line 32
    .line 33
    check-cast p0, Lmw3;

    .line 34
    .line 35
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    invoke-static {p1}, Lmw3;->B(Landroid/view/View;)I

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    iget p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final e(Landroid/view/View;)I
    .locals 2

    .line 1
    iget v0, p0, Lib3;->d:I

    .line 2
    .line 3
    iget-object p0, p0, Lqz0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lnw3;

    .line 13
    .line 14
    check-cast p0, Lmw3;

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    check-cast p0, Lnw3;

    .line 24
    .line 25
    iget-object p0, p0, Lnw3;->b:Landroid/graphics/Rect;

    .line 26
    .line 27
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    iget v1, p0, Landroid/graphics/Rect;->top:I

    .line 32
    .line 33
    add-int/2addr p1, v1

    .line 34
    iget p0, p0, Landroid/graphics/Rect;->bottom:I

    .line 35
    .line 36
    add-int/2addr p1, p0

    .line 37
    iget p0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 38
    .line 39
    add-int/2addr p1, p0

    .line 40
    iget p0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 41
    .line 42
    :goto_0
    add-int/2addr p1, p0

    .line 43
    return p1

    .line 44
    :pswitch_0
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    check-cast v0, Lnw3;

    .line 49
    .line 50
    check-cast p0, Lmw3;

    .line 51
    .line 52
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    check-cast p0, Lnw3;

    .line 60
    .line 61
    iget-object p0, p0, Lnw3;->b:Landroid/graphics/Rect;

    .line 62
    .line 63
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    iget v1, p0, Landroid/graphics/Rect;->left:I

    .line 68
    .line 69
    add-int/2addr p1, v1

    .line 70
    iget p0, p0, Landroid/graphics/Rect;->right:I

    .line 71
    .line 72
    add-int/2addr p1, p0

    .line 73
    iget p0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 74
    .line 75
    add-int/2addr p1, p0

    .line 76
    iget p0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final f(Landroid/view/View;)I
    .locals 2

    .line 1
    iget v0, p0, Lib3;->d:I

    .line 2
    .line 3
    iget-object p0, p0, Lqz0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lnw3;

    .line 13
    .line 14
    check-cast p0, Lmw3;

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    check-cast p0, Lnw3;

    .line 24
    .line 25
    iget-object p0, p0, Lnw3;->b:Landroid/graphics/Rect;

    .line 26
    .line 27
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    iget v1, p0, Landroid/graphics/Rect;->left:I

    .line 32
    .line 33
    add-int/2addr p1, v1

    .line 34
    iget p0, p0, Landroid/graphics/Rect;->right:I

    .line 35
    .line 36
    add-int/2addr p1, p0

    .line 37
    iget p0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 38
    .line 39
    add-int/2addr p1, p0

    .line 40
    iget p0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 41
    .line 42
    :goto_0
    add-int/2addr p1, p0

    .line 43
    return p1

    .line 44
    :pswitch_0
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    check-cast v0, Lnw3;

    .line 49
    .line 50
    check-cast p0, Lmw3;

    .line 51
    .line 52
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    check-cast p0, Lnw3;

    .line 60
    .line 61
    iget-object p0, p0, Lnw3;->b:Landroid/graphics/Rect;

    .line 62
    .line 63
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    iget v1, p0, Landroid/graphics/Rect;->top:I

    .line 68
    .line 69
    add-int/2addr p1, v1

    .line 70
    iget p0, p0, Landroid/graphics/Rect;->bottom:I

    .line 71
    .line 72
    add-int/2addr p1, p0

    .line 73
    iget p0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 74
    .line 75
    add-int/2addr p1, p0

    .line 76
    iget p0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final g(Landroid/view/View;)I
    .locals 1

    .line 1
    iget v0, p0, Lib3;->d:I

    .line 2
    .line 3
    iget-object p0, p0, Lqz0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lnw3;

    .line 13
    .line 14
    check-cast p0, Lmw3;

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-static {p1}, Lmw3;->C(Landroid/view/View;)I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    iget p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 24
    .line 25
    :goto_0
    sub-int/2addr p0, p1

    .line 26
    return p0

    .line 27
    :pswitch_0
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Lnw3;

    .line 32
    .line 33
    check-cast p0, Lmw3;

    .line 34
    .line 35
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    invoke-static {p1}, Lmw3;->A(Landroid/view/View;)I

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    iget p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final h()I
    .locals 1

    .line 1
    iget v0, p0, Lib3;->d:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lqz0;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Lmw3;

    .line 9
    .line 10
    iget p0, p0, Lmw3;->o:I

    .line 11
    .line 12
    return p0

    .line 13
    :pswitch_0
    iget-object p0, p0, Lqz0;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Lmw3;

    .line 16
    .line 17
    iget p0, p0, Lmw3;->n:I

    .line 18
    .line 19
    return p0

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final i()I
    .locals 1

    .line 1
    iget v0, p0, Lib3;->d:I

    .line 2
    .line 3
    iget-object p0, p0, Lqz0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Lmw3;

    .line 9
    .line 10
    iget v0, p0, Lmw3;->o:I

    .line 11
    .line 12
    invoke-virtual {p0}, Lmw3;->E()I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    :goto_0
    sub-int/2addr v0, p0

    .line 17
    return v0

    .line 18
    :pswitch_0
    check-cast p0, Lmw3;

    .line 19
    .line 20
    iget v0, p0, Lmw3;->n:I

    .line 21
    .line 22
    invoke-virtual {p0}, Lmw3;->G()I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final j()I
    .locals 1

    .line 1
    iget v0, p0, Lib3;->d:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lqz0;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Lmw3;

    .line 9
    .line 10
    invoke-virtual {p0}, Lmw3;->E()I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0

    .line 15
    :pswitch_0
    iget-object p0, p0, Lqz0;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p0, Lmw3;

    .line 18
    .line 19
    invoke-virtual {p0}, Lmw3;->G()I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    return p0

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final k()I
    .locals 1

    .line 1
    iget v0, p0, Lib3;->d:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lqz0;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Lmw3;

    .line 9
    .line 10
    iget p0, p0, Lmw3;->m:I

    .line 11
    .line 12
    return p0

    .line 13
    :pswitch_0
    iget-object p0, p0, Lqz0;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Lmw3;

    .line 16
    .line 17
    iget p0, p0, Lmw3;->l:I

    .line 18
    .line 19
    return p0

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final l()I
    .locals 1

    .line 1
    iget v0, p0, Lib3;->d:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lqz0;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Lmw3;

    .line 9
    .line 10
    iget p0, p0, Lmw3;->l:I

    .line 11
    .line 12
    return p0

    .line 13
    :pswitch_0
    iget-object p0, p0, Lqz0;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Lmw3;

    .line 16
    .line 17
    iget p0, p0, Lmw3;->m:I

    .line 18
    .line 19
    return p0

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final m()I
    .locals 1

    .line 1
    iget v0, p0, Lib3;->d:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lqz0;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Lmw3;

    .line 9
    .line 10
    invoke-virtual {p0}, Lmw3;->H()I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0

    .line 15
    :pswitch_0
    iget-object p0, p0, Lqz0;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p0, Lmw3;

    .line 18
    .line 19
    invoke-virtual {p0}, Lmw3;->F()I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    return p0

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final n()I
    .locals 2

    .line 1
    iget v0, p0, Lib3;->d:I

    .line 2
    .line 3
    iget-object p0, p0, Lqz0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Lmw3;

    .line 9
    .line 10
    iget v0, p0, Lmw3;->o:I

    .line 11
    .line 12
    invoke-virtual {p0}, Lmw3;->H()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    sub-int/2addr v0, v1

    .line 17
    invoke-virtual {p0}, Lmw3;->E()I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    :goto_0
    sub-int/2addr v0, p0

    .line 22
    return v0

    .line 23
    :pswitch_0
    check-cast p0, Lmw3;

    .line 24
    .line 25
    iget v0, p0, Lmw3;->n:I

    .line 26
    .line 27
    invoke-virtual {p0}, Lmw3;->F()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    sub-int/2addr v0, v1

    .line 32
    invoke-virtual {p0}, Lmw3;->G()I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    goto :goto_0

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final o(Landroid/view/View;)I
    .locals 2

    .line 1
    iget v0, p0, Lib3;->d:I

    .line 2
    .line 3
    iget-object v1, p0, Lqz0;->c:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object p0, p0, Lqz0;->b:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p0, Lmw3;

    .line 11
    .line 12
    check-cast v1, Landroid/graphics/Rect;

    .line 13
    .line 14
    invoke-virtual {p0, p1, v1}, Lmw3;->L(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 15
    .line 16
    .line 17
    iget p0, v1, Landroid/graphics/Rect;->bottom:I

    .line 18
    .line 19
    return p0

    .line 20
    :pswitch_0
    check-cast p0, Lmw3;

    .line 21
    .line 22
    check-cast v1, Landroid/graphics/Rect;

    .line 23
    .line 24
    invoke-virtual {p0, p1, v1}, Lmw3;->L(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 25
    .line 26
    .line 27
    iget p0, v1, Landroid/graphics/Rect;->right:I

    .line 28
    .line 29
    return p0

    .line 30
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final p(Landroid/view/View;)I
    .locals 2

    .line 1
    iget v0, p0, Lib3;->d:I

    .line 2
    .line 3
    iget-object v1, p0, Lqz0;->c:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object p0, p0, Lqz0;->b:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p0, Lmw3;

    .line 11
    .line 12
    check-cast v1, Landroid/graphics/Rect;

    .line 13
    .line 14
    invoke-virtual {p0, p1, v1}, Lmw3;->L(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 15
    .line 16
    .line 17
    iget p0, v1, Landroid/graphics/Rect;->top:I

    .line 18
    .line 19
    return p0

    .line 20
    :pswitch_0
    check-cast p0, Lmw3;

    .line 21
    .line 22
    check-cast v1, Landroid/graphics/Rect;

    .line 23
    .line 24
    invoke-virtual {p0, p1, v1}, Lmw3;->L(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 25
    .line 26
    .line 27
    iget p0, v1, Landroid/graphics/Rect;->left:I

    .line 28
    .line 29
    return p0

    .line 30
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final q(I)V
    .locals 1

    .line 1
    iget v0, p0, Lib3;->d:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lqz0;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Lmw3;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lmw3;->R(I)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    iget-object p0, p0, Lqz0;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, Lmw3;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Lmw3;->Q(I)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
