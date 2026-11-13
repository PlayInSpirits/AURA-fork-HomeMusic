.class public final Ldefpackage/jd4;
.super Ldefpackage/rp;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic b:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Ldefpackage/jd4;->b:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x3

    .line 7
    invoke-direct {p0, p1}, Ldefpackage/rp;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Ldefpackage/rp;->a:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Ldefpackage/kd4;

    .line 13
    .line 14
    const/4 p1, 0x1

    .line 15
    iput-boolean p1, p0, Ldefpackage/kd4;->p:Z

    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    const/4 p1, 0x3

    .line 19
    invoke-direct {p0, p1}, Ldefpackage/rp;-><init>(I)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public g(Landroid/content/res/TypedArray;)Ldefpackage/rp;
    .locals 4

    .line 1
    iget v0, p0, Ldefpackage/jd4;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Ldefpackage/rp;->g(Landroid/content/res/TypedArray;)Ldefpackage/rp;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    iget-object v0, p0, Ldefpackage/rp;->a:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Ldefpackage/kd4;

    .line 14
    .line 15
    invoke-super {p0, p1}, Ldefpackage/rp;->g(Landroid/content/res/TypedArray;)Ldefpackage/rp;

    .line 16
    .line 17
    .line 18
    const/4 v1, 0x2

    .line 19
    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    iget v2, v0, Ldefpackage/kd4;->e:I

    .line 26
    .line 27
    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    iget v2, v0, Ldefpackage/kd4;->e:I

    .line 32
    .line 33
    const/high16 v3, -0x1000000

    .line 34
    .line 35
    and-int/2addr v2, v3

    .line 36
    const v3, 0xffffff

    .line 37
    .line 38
    .line 39
    and-int/2addr v1, v3

    .line 40
    or-int/2addr v1, v2

    .line 41
    iput v1, v0, Ldefpackage/kd4;->e:I

    .line 42
    .line 43
    :cond_0
    const/16 v1, 0xc

    .line 44
    .line 45
    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-eqz v2, :cond_1

    .line 50
    .line 51
    iget v2, v0, Ldefpackage/kd4;->d:I

    .line 52
    .line 53
    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    iput p1, v0, Ldefpackage/kd4;->d:I

    .line 58
    .line 59
    :cond_1
    return-object p0

    .line 60
    nop

    .line 61
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final j()Ldefpackage/rp;
    .locals 1

    .line 1
    iget v0, p0, Ldefpackage/jd4;->b:I

    .line 2
    .line 3
    return-object p0
.end method
