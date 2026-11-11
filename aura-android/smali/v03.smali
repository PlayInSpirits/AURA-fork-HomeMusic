.class public final Lv03;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lvw4;


# instance fields
.field public final synthetic a:I

.field public b:F

.field public c:F

.field public d:F

.field public e:F


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lv03;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput v0, p0, Lv03;->b:F

    .line 9
    .line 10
    iput v0, p0, Lv03;->c:F

    .line 11
    .line 12
    iput v0, p0, Lv03;->d:F

    .line 13
    .line 14
    iput v0, p0, Lv03;->e:F

    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>(FFFF)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lv03;->a:I

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lv03;->b:F

    iput p2, p0, Lv03;->c:F

    iput p3, p0, Lv03;->d:F

    iput p4, p0, Lv03;->e:F

    return-void
.end method


# virtual methods
.method public a(Landroid/graphics/Canvas;Landroid/graphics/Paint;Landroid/graphics/RectF;)V
    .locals 6

    .line 1
    new-instance v0, Landroid/graphics/Path;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 4
    .line 5
    .line 6
    iget v1, p0, Lv03;->b:F

    .line 7
    .line 8
    iget v2, p0, Lv03;->c:F

    .line 9
    .line 10
    iget v3, p0, Lv03;->d:F

    .line 11
    .line 12
    iget p0, p0, Lv03;->e:F

    .line 13
    .line 14
    const/16 v4, 0x8

    .line 15
    .line 16
    new-array v4, v4, [F

    .line 17
    .line 18
    const/4 v5, 0x0

    .line 19
    aput v1, v4, v5

    .line 20
    .line 21
    const/4 v5, 0x1

    .line 22
    aput v1, v4, v5

    .line 23
    .line 24
    const/4 v1, 0x2

    .line 25
    aput v2, v4, v1

    .line 26
    .line 27
    const/4 v1, 0x3

    .line 28
    aput v2, v4, v1

    .line 29
    .line 30
    const/4 v1, 0x4

    .line 31
    aput v3, v4, v1

    .line 32
    .line 33
    const/4 v1, 0x5

    .line 34
    aput v3, v4, v1

    .line 35
    .line 36
    const/4 v1, 0x6

    .line 37
    aput p0, v4, v1

    .line 38
    .line 39
    const/4 v1, 0x7

    .line 40
    aput p0, v4, v1

    .line 41
    .line 42
    sget-object p0, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 43
    .line 44
    invoke-virtual {v0, p3, v4, p0}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;[FLandroid/graphics/Path$Direction;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1, v0, p2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public b(FFFF)V
    .locals 1

    .line 1
    iget v0, p0, Lv03;->b:F

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljava/lang/Math;->max(FF)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    iput p1, p0, Lv03;->b:F

    .line 8
    .line 9
    iget p1, p0, Lv03;->c:F

    .line 10
    .line 11
    invoke-static {p2, p1}, Ljava/lang/Math;->max(FF)F

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    iput p1, p0, Lv03;->c:F

    .line 16
    .line 17
    iget p1, p0, Lv03;->d:F

    .line 18
    .line 19
    invoke-static {p3, p1}, Ljava/lang/Math;->min(FF)F

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    iput p1, p0, Lv03;->d:F

    .line 24
    .line 25
    iget p1, p0, Lv03;->e:F

    .line 26
    .line 27
    invoke-static {p4, p1}, Ljava/lang/Math;->min(FF)F

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    iput p1, p0, Lv03;->e:F

    .line 32
    .line 33
    return-void
.end method

.method public c()Z
    .locals 4

    .line 1
    iget v0, p0, Lv03;->b:F

    .line 2
    .line 3
    iget v1, p0, Lv03;->d:F

    .line 4
    .line 5
    cmpl-float v0, v0, v1

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x1

    .line 9
    if-ltz v0, :cond_0

    .line 10
    .line 11
    move v0, v2

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move v0, v1

    .line 14
    :goto_0
    iget v3, p0, Lv03;->c:F

    .line 15
    .line 16
    iget p0, p0, Lv03;->e:F

    .line 17
    .line 18
    cmpl-float p0, v3, p0

    .line 19
    .line 20
    if-ltz p0, :cond_1

    .line 21
    .line 22
    move v1, v2

    .line 23
    :cond_1
    or-int p0, v0, v1

    .line 24
    .line 25
    return p0
.end method

.method public d(J)V
    .locals 3

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    shr-long v0, p1, v0

    .line 4
    .line 5
    long-to-int v0, v0

    .line 6
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const-wide v1, 0xffffffffL

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    and-long/2addr p1, v1

    .line 16
    long-to-int p1, p1

    .line 17
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    iget p2, p0, Lv03;->b:F

    .line 22
    .line 23
    add-float/2addr p2, v0

    .line 24
    iput p2, p0, Lv03;->b:F

    .line 25
    .line 26
    iget p2, p0, Lv03;->c:F

    .line 27
    .line 28
    add-float/2addr p2, p1

    .line 29
    iput p2, p0, Lv03;->c:F

    .line 30
    .line 31
    iget p2, p0, Lv03;->d:F

    .line 32
    .line 33
    add-float/2addr p2, v0

    .line 34
    iput p2, p0, Lv03;->d:F

    .line 35
    .line 36
    iget p2, p0, Lv03;->e:F

    .line 37
    .line 38
    add-float/2addr p2, p1

    .line 39
    iput p2, p0, Lv03;->e:F

    .line 40
    .line 41
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .line 1
    iget v0, p0, Lv03;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    iget v0, p0, Lv03;->b:F

    .line 12
    .line 13
    invoke-static {v0}, Lgh0;->F(F)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget v1, p0, Lv03;->c:F

    .line 18
    .line 19
    invoke-static {v1}, Lgh0;->F(F)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    iget v2, p0, Lv03;->d:F

    .line 24
    .line 25
    invoke-static {v2}, Lgh0;->F(F)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    iget p0, p0, Lv03;->e:F

    .line 30
    .line 31
    invoke-static {p0}, Lgh0;->F(F)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    const-string v3, "MutableRect("

    .line 36
    .line 37
    const-string v4, ", "

    .line 38
    .line 39
    invoke-static {v3, v0, v4, v1, v4}, Lb11;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string p0, ")"

    .line 53
    .line 54
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
