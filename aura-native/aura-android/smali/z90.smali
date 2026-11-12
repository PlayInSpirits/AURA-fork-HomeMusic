.class public final synthetic Lz90;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Laa0;


# instance fields
.field public final synthetic a:Lna4;

.field public final synthetic b:Lfr2;

.field public final synthetic c:Lmi3;


# direct methods
.method public synthetic constructor <init>(Lna4;Lfr2;Lmi3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lz90;->a:Lna4;

    .line 5
    .line 6
    iput-object p2, p0, Lz90;->b:Lfr2;

    .line 7
    .line 8
    iput-object p3, p0, Lz90;->c:Lmi3;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()Lic2;
    .locals 2

    .line 1
    iget-object v0, p0, Lz90;->a:Lna4;

    .line 2
    .line 3
    iget-object v0, v0, Lna4;->q:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ljava/lang/ref/WeakReference;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ltn2;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v1, p0, Lz90;->b:Lfr2;

    .line 16
    .line 17
    iget-object p0, p0, Lz90;->c:Lmi3;

    .line 18
    .line 19
    invoke-virtual {v0, v1, p0}, Ltn2;->v(Lfr2;Lmi3;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    sget-object p0, Lmw1;->o:Lmw1;

    .line 23
    .line 24
    return-object p0
.end method
