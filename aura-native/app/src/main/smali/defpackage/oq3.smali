.class public final synthetic Ldefpackage/oq3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Ldefpackage/pq3;

.field public final synthetic b:Ljava/util/ArrayList;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ldefpackage/pq3;Ljava/util/ArrayList;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/oq3;->a:Ldefpackage/pq3;

    .line 5
    .line 6
    iput-object p2, p0, Ldefpackage/oq3;->b:Ljava/util/ArrayList;

    .line 7
    .line 8
    iput-object p3, p0, Ldefpackage/oq3;->c:Ljava/lang/String;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/oq3;->a:Ldefpackage/pq3;

    .line 2
    .line 3
    iget-object v0, v0, Ldefpackage/pq3;->e:Landroidx/work/impl/WorkDatabase;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->B()Ldefpackage/hd5;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, p0, Ldefpackage/oq3;->c:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {v1, v2}, Ldefpackage/hd5;->j(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iget-object p0, p0, Ldefpackage/oq3;->b:Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->A()Ldefpackage/fd5;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-virtual {p0, v2}, Ldefpackage/fd5;->h(Ljava/lang/String;)Ldefpackage/dd5;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method
