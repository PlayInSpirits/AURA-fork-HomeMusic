.class public final Li81;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/animation/TypeEvaluator;


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 10
    const/4 v0, 0x0

    iput v0, p0, Li81;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/graphics/Rect;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Li81;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Li81;->b:Ljava/lang/Object;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Li81;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p2, Landroid/graphics/Rect;

    .line 7
    .line 8
    check-cast p3, Landroid/graphics/Rect;

    .line 9
    .line 10
    iget v0, p2, Landroid/graphics/Rect;->left:I

    .line 11
    .line 12
    iget v1, p3, Landroid/graphics/Rect;->left:I

    .line 13
    .line 14
    sub-int/2addr v1, v0

    .line 15
    int-to-float v1, v1

    .line 16
    mul-float/2addr v1, p1

    .line 17
    float-to-int v1, v1

    .line 18
    add-int/2addr v0, v1

    .line 19
    iget v1, p2, Landroid/graphics/Rect;->top:I

    .line 20
    .line 21
    iget v2, p3, Landroid/graphics/Rect;->top:I

    .line 22
    .line 23
    sub-int/2addr v2, v1

    .line 24
    int-to-float v2, v2

    .line 25
    mul-float/2addr v2, p1

    .line 26
    float-to-int v2, v2

    .line 27
    add-int/2addr v1, v2

    .line 28
    iget v2, p2, Landroid/graphics/Rect;->right:I

    .line 29
    .line 30
    iget v3, p3, Landroid/graphics/Rect;->right:I

    .line 31
    .line 32
    sub-int/2addr v3, v2

    .line 33
    int-to-float v3, v3

    .line 34
    mul-float/2addr v3, p1

    .line 35
    float-to-int v3, v3

    .line 36
    add-int/2addr v2, v3

    .line 37
    iget p2, p2, Landroid/graphics/Rect;->bottom:I

    .line 38
    .line 39
    iget p3, p3, Landroid/graphics/Rect;->bottom:I

    .line 40
    .line 41
    sub-int/2addr p3, p2

    .line 42
    int-to-float p3, p3

    .line 43
    mul-float/2addr p3, p1

    .line 44
    float-to-int p1, p3

    .line 45
    add-int/2addr p2, p1

    .line 46
    iget-object p0, p0, Li81;->b:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p0, Landroid/graphics/Rect;

    .line 49
    .line 50
    invoke-virtual {p0, v0, v1, v2, p2}, Landroid/graphics/Rect;->set(IIII)V

    .line 51
    .line 52
    .line 53
    return-object p0

    .line 54
    :pswitch_0
    check-cast p2, Ljava/lang/Float;

    .line 55
    .line 56
    check-cast p3, Ljava/lang/Float;

    .line 57
    .line 58
    iget-object p0, p0, Li81;->b:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast p0, Landroid/animation/FloatEvaluator;

    .line 61
    .line 62
    invoke-virtual {p0, p1, p2, p3}, Landroid/animation/FloatEvaluator;->evaluate(FLjava/lang/Number;Ljava/lang/Number;)Ljava/lang/Float;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    const p1, 0x3dcccccd    # 0.1f

    .line 71
    .line 72
    .line 73
    cmpg-float p1, p0, p1

    .line 74
    .line 75
    if-gez p1, :cond_0

    .line 76
    .line 77
    const/4 p0, 0x0

    .line 78
    :cond_0
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    return-object p0

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
