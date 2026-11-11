.class public final Ldh0;
.super Lei2;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final r:Landroid/graphics/RectF;


# direct methods
.method public constructor <init>(Lbc4;Landroid/graphics/RectF;)V
    .locals 0

    .line 9
    invoke-direct {p0, p1}, Lei2;-><init>(Lbc4;)V

    .line 10
    iput-object p2, p0, Ldh0;->r:Landroid/graphics/RectF;

    return-void
.end method

.method public constructor <init>(Ldh0;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lei2;-><init>(Lei2;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p1, Ldh0;->r:Landroid/graphics/RectF;

    .line 5
    .line 6
    iput-object p1, p0, Ldh0;->r:Landroid/graphics/RectF;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final newDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    new-instance v0, Leh0;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lfi2;-><init>(Lei2;)V

    .line 4
    .line 5
    .line 6
    iput-object p0, v0, Leh0;->K:Ldh0;

    .line 7
    .line 8
    invoke-virtual {v0}, Lfi2;->invalidateSelf()V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method
