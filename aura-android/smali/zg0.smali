.class public abstract Lzg0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lwq4;


# instance fields
.field public final n:I

.field public final o:I

.field public p:Lpz3;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/high16 v0, -0x80000000

    .line 5
    .line 6
    invoke-static {v0, v0}, Le35;->I(II)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    iput v0, p0, Lzg0;->n:I

    .line 13
    .line 14
    iput v0, p0, Lzg0;->o:I

    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    const-string p0, "Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648"

    .line 18
    .line 19
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    throw p0
.end method


# virtual methods
.method public final b(Lcf4;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final d(Lcf4;)V
    .locals 1

    .line 1
    iget v0, p0, Lzg0;->n:I

    .line 2
    .line 3
    iget p0, p0, Lzg0;->o:I

    .line 4
    .line 5
    invoke-virtual {p1, v0, p0}, Lcf4;->m(II)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final e(Lpz3;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lzg0;->p:Lpz3;

    .line 2
    .line 3
    return-void
.end method

.method public final h()V
    .locals 0

    .line 1
    return-void
.end method

.method public final i(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final j()V
    .locals 0

    .line 1
    return-void
.end method

.method public final k(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final l()Lpz3;
    .locals 0

    .line 1
    iget-object p0, p0, Lzg0;->p:Lpz3;

    .line 2
    .line 3
    return-object p0
.end method

.method public final n()V
    .locals 0

    .line 1
    return-void
.end method
