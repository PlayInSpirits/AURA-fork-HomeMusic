.class public abstract Ldefpackage/b71;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final a:Ldefpackage/s32;

.field public static final b:Ldefpackage/y04;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    :try_start_0
    const-string v0, "java.nio.file.Files"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v0, Ldefpackage/x53;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    .line 10
    .line 11
    goto :goto_0

    .line 12
    :catch_0
    new-instance v0, Ldefpackage/s32;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    .line 17
    :goto_0
    sput-object v0, Ldefpackage/b71;->a:Ldefpackage/s32;

    .line 18
    .line 19
    sget-object v0, Ldefpackage/ge3;->o:Ljava/lang/String;

    .line 20
    .line 21
    const-string v0, "java.io.tmpdir"

    .line 22
    .line 23
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-static {v0}, Ldefpackage/tv1;->z(Ljava/lang/String;)Ldefpackage/ge3;

    .line 31
    .line 32
    .line 33
    new-instance v0, Ldefpackage/y04;

    .line 34
    .line 35
    const-class v1, Ldefpackage/y04;

    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    invoke-direct {v0, v1}, Ldefpackage/y04;-><init>(Ljava/lang/ClassLoader;)V

    .line 45
    .line 46
    .line 47
    sput-object v0, Ldefpackage/b71;->b:Ldefpackage/y04;

    .line 48
    .line 49
    return-void
.end method


# virtual methods
.method public abstract a(Ldefpackage/ge3;)Ldefpackage/of4;
.end method

.method public abstract b(Ldefpackage/ge3;Ldefpackage/ge3;)V
.end method

.method public abstract c(Ldefpackage/ge3;)V
.end method

.method public abstract d(Ldefpackage/ge3;)V
.end method

.method public final e(Ldefpackage/ge3;)Z
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Ldefpackage/b71;->h(Ldefpackage/ge3;)Ldefpackage/xo0;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    const/4 p0, 0x1

    .line 11
    return p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return p0
.end method

.method public abstract f(Ldefpackage/ge3;)Ljava/util/List;
.end method

.method public final g(Ldefpackage/ge3;)Ldefpackage/xo0;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Ldefpackage/b71;->h(Ldefpackage/ge3;)Ldefpackage/xo0;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_0
    const-string p0, "no such file: "

    .line 12
    .line 13
    invoke-static {p1, p0}, Ldefpackage/mj0;->k(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/4 p0, 0x0

    .line 17
    return-object p0
.end method

.method public abstract h(Ldefpackage/ge3;)Ldefpackage/xo0;
.end method

.method public abstract i(Ldefpackage/ge3;)Ldefpackage/r32;
.end method

.method public abstract j(Ldefpackage/ge3;)Ldefpackage/of4;
.end method

.method public abstract k(Ldefpackage/ge3;)Ldefpackage/ej4;
.end method
