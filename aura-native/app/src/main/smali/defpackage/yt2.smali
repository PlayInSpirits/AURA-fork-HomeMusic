.class public final synthetic Ldefpackage/yt2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Ldefpackage/zt2;

.field public final synthetic o:Landroid/util/Pair;

.field public final synthetic p:Ldefpackage/ed2;

.field public final synthetic q:Ldefpackage/un2;

.field public final synthetic r:Ljava/io/IOException;

.field public final synthetic s:Z


# direct methods
.method public synthetic constructor <init>(Ldefpackage/zt2;Landroid/util/Pair;Ldefpackage/ed2;Ldefpackage/un2;Ljava/io/IOException;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/yt2;->n:Ldefpackage/zt2;

    .line 5
    .line 6
    iput-object p2, p0, Ldefpackage/yt2;->o:Landroid/util/Pair;

    .line 7
    .line 8
    iput-object p3, p0, Ldefpackage/yt2;->p:Ldefpackage/ed2;

    .line 9
    .line 10
    iput-object p4, p0, Ldefpackage/yt2;->q:Ldefpackage/un2;

    .line 11
    .line 12
    iput-object p5, p0, Ldefpackage/yt2;->r:Ljava/io/IOException;

    .line 13
    .line 14
    iput-boolean p6, p0, Ldefpackage/yt2;->s:Z

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 1
    iget-object v0, p0, Ldefpackage/yt2;->n:Ldefpackage/zt2;

    .line 2
    .line 3
    iget-object v0, v0, Ldefpackage/zt2;->o:Ldefpackage/fo1;

    .line 4
    .line 5
    iget-object v0, v0, Ldefpackage/fo1;->i:Ljava/lang/Object;

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, Ldefpackage/nj0;

    .line 9
    .line 10
    iget-object v0, p0, Ldefpackage/yt2;->o:Landroid/util/Pair;

    .line 11
    .line 12
    iget-object v2, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Ljava/lang/Integer;

    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 21
    .line 22
    move-object v3, v0

    .line 23
    check-cast v3, Ldefpackage/mt2;

    .line 24
    .line 25
    iget-object v4, p0, Ldefpackage/yt2;->p:Ldefpackage/ed2;

    .line 26
    .line 27
    iget-object v5, p0, Ldefpackage/yt2;->q:Ldefpackage/un2;

    .line 28
    .line 29
    iget-object v6, p0, Ldefpackage/yt2;->r:Ljava/io/IOException;

    .line 30
    .line 31
    iget-boolean v7, p0, Ldefpackage/yt2;->s:Z

    .line 32
    .line 33
    invoke-virtual/range {v1 .. v7}, Ldefpackage/nj0;->y(ILdefpackage/mt2;Ldefpackage/ed2;Ldefpackage/un2;Ljava/io/IOException;Z)V

    .line 34
    .line 35
    .line 36
    return-void
.end method
