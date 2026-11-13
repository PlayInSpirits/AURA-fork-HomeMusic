.class public final Ldefpackage/rx3;
.super Ldefpackage/qx3;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final b:Ldefpackage/o73;


# direct methods
.method public constructor <init>(Ldefpackage/o73;Ljava/util/LinkedHashMap;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2}, Ldefpackage/qx3;-><init>(Ljava/util/LinkedHashMap;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/rx3;->b:Ldefpackage/o73;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final c()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/rx3;->b:Ldefpackage/o73;

    .line 2
    .line 3
    invoke-interface {p0}, Ldefpackage/o73;->A()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final d(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    return-object p1
.end method

.method public final e(Ljava/lang/Object;Ldefpackage/l32;Ldefpackage/px3;)V
    .locals 1

    .line 1
    iget-object p0, p3, Ldefpackage/px3;->b:Ljava/lang/reflect/Field;

    .line 2
    .line 3
    iget-object v0, p3, Ldefpackage/px3;->h:Ldefpackage/bz4;

    .line 4
    .line 5
    invoke-virtual {v0, p2}, Ldefpackage/bz4;->a(Ldefpackage/l32;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    if-nez p2, :cond_1

    .line 10
    .line 11
    iget-boolean v0, p3, Ldefpackage/px3;->k:Z

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    return-void

    .line 17
    :cond_1
    :goto_0
    iget-boolean p3, p3, Ldefpackage/px3;->l:Z

    .line 18
    .line 19
    if-nez p3, :cond_2

    .line 20
    .line 21
    invoke-virtual {p0, p1, p2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_2
    const/4 p1, 0x0

    .line 26
    invoke-static {p0, p1}, Ldefpackage/ox3;->d(Ljava/lang/reflect/AccessibleObject;Z)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    new-instance p1, Lcom/google/gson/JsonIOException;

    .line 31
    .line 32
    const-string p2, "Cannot set value of \'static final\' "

    .line 33
    .line 34
    invoke-virtual {p2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw p1
.end method
