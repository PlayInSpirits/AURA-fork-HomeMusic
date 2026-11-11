.class public final Lbh2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/window/OnBackAnimationCallback;


# instance fields
.field public final synthetic a:Lzg2;

.field public final synthetic b:Lch2;


# direct methods
.method public constructor <init>(Lch2;Lzg2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lbh2;->b:Lch2;

    .line 5
    .line 6
    iput-object p2, p0, Lbh2;->a:Lzg2;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onBackCancelled()V
    .locals 1

    .line 1
    iget-object v0, p0, Lbh2;->b:Lch2;

    .line 2
    .line 3
    iget-object v0, v0, Lah2;->a:Landroid/window/OnBackInvokedCallback;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lbh2;->a:Lzg2;

    .line 8
    .line 9
    invoke-interface {p0}, Lzg2;->d()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final onBackInvoked()V
    .locals 0

    .line 1
    iget-object p0, p0, Lbh2;->a:Lzg2;

    .line 2
    .line 3
    invoke-interface {p0}, Lzg2;->a()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onBackProgressed(Landroid/window/BackEvent;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lbh2;->b:Lch2;

    .line 2
    .line 3
    iget-object v0, v0, Lah2;->a:Landroid/window/OnBackInvokedCallback;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Loo;

    .line 8
    .line 9
    invoke-direct {v0, p1}, Loo;-><init>(Landroid/window/BackEvent;)V

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, Lbh2;->a:Lzg2;

    .line 13
    .line 14
    invoke-interface {p0, v0}, Lzg2;->b(Loo;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final onBackStarted(Landroid/window/BackEvent;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lbh2;->b:Lch2;

    .line 2
    .line 3
    iget-object v0, v0, Lah2;->a:Landroid/window/OnBackInvokedCallback;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Loo;

    .line 8
    .line 9
    invoke-direct {v0, p1}, Loo;-><init>(Landroid/window/BackEvent;)V

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, Lbh2;->a:Lzg2;

    .line 13
    .line 14
    invoke-interface {p0, v0}, Lzg2;->c(Loo;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method
