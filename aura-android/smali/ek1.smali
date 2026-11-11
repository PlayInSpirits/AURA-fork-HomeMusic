.class public final Lek1;
.super Lkw3;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:I

.field public final b:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lek1;->a:I

    .line 5
    .line 6
    iput p2, p0, Lek1;->b:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final f(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Lyw3;)V
    .locals 1

    .line 1
    invoke-static {p2}, Landroidx/recyclerview/widget/RecyclerView;->N(Landroid/view/View;)Lcx3;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    invoke-virtual {p2}, Lcx3;->b()I

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p2, -0x1

    .line 13
    :goto_0
    iget p3, p0, Lek1;->a:I

    .line 14
    .line 15
    rem-int p4, p2, p3

    .line 16
    .line 17
    iget p0, p0, Lek1;->b:I

    .line 18
    .line 19
    mul-int v0, p4, p0

    .line 20
    .line 21
    div-int/2addr v0, p3

    .line 22
    iput v0, p1, Landroid/graphics/Rect;->left:I

    .line 23
    .line 24
    add-int/lit8 p4, p4, 0x1

    .line 25
    .line 26
    mul-int/2addr p4, p0

    .line 27
    div-int/2addr p4, p3

    .line 28
    sub-int p4, p0, p4

    .line 29
    .line 30
    iput p4, p1, Landroid/graphics/Rect;->right:I

    .line 31
    .line 32
    if-lt p2, p3, :cond_1

    .line 33
    .line 34
    iput p0, p1, Landroid/graphics/Rect;->top:I

    .line 35
    .line 36
    :cond_1
    return-void
.end method
