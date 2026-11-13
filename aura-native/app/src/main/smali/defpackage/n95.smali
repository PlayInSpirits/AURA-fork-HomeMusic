.class public abstract Ldefpackage/n95;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final a:Ldefpackage/o95;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    :try_start_0
    invoke-static {}, Ldefpackage/h12;->p()Ljava/lang/reflect/InvocationHandler;

    .line 2
    .line 3
    .line 4
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    new-instance v1, Ldefpackage/h45;

    .line 6
    .line 7
    const-class v2, Lorg/chromium/support_lib_boundary/WebViewProviderFactoryBoundaryInterface;

    .line 8
    .line 9
    invoke-static {v2, v0}, Ldefpackage/fu;->j(Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lorg/chromium/support_lib_boundary/WebViewProviderFactoryBoundaryInterface;

    .line 14
    .line 15
    const/4 v2, 0x3

    .line 16
    invoke-direct {v1, v2, v0}, Ldefpackage/h45;-><init>(ILjava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catch_0
    new-instance v1, Ldefpackage/fz0;

    .line 21
    .line 22
    const/16 v0, 0x19

    .line 23
    .line 24
    invoke-direct {v1, v0}, Ldefpackage/fz0;-><init>(I)V

    .line 25
    .line 26
    .line 27
    :goto_0
    sput-object v1, Ldefpackage/n95;->a:Ldefpackage/o95;

    .line 28
    .line 29
    return-void

    .line 30
    :catch_1
    move-exception v0

    .line 31
    invoke-static {v0}, Ldefpackage/er1;->m(Ljava/lang/Throwable;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method
