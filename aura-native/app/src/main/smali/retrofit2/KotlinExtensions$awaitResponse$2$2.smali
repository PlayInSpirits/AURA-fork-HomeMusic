.class public final Lretrofit2/KotlinExtensions$awaitResponse$2$2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lretrofit2/Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lretrofit2/KotlinExtensions;->awaitResponse(Lretrofit2/Call;Ldefpackage/vd0;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lretrofit2/Callback<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final synthetic $continuation:Ldefpackage/az;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldefpackage/az;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldefpackage/az;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldefpackage/az;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lretrofit2/KotlinExtensions$awaitResponse$2$2;->$continuation:Ldefpackage/az;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onFailure(Lretrofit2/Call;Ljava/lang/Throwable;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lretrofit2/Call<",
            "TT;>;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, Lretrofit2/KotlinExtensions$awaitResponse$2$2;->$continuation:Ldefpackage/az;

    .line 8
    .line 9
    new-instance p1, Ldefpackage/s14;

    .line 10
    .line 11
    invoke-direct {p1, p2}, Ldefpackage/s14;-><init>(Ljava/lang/Throwable;)V

    .line 12
    .line 13
    .line 14
    invoke-interface {p0, p1}, Ldefpackage/vd0;->resumeWith(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public onResponse(Lretrofit2/Call;Lretrofit2/Response;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lretrofit2/Call<",
            "TT;>;",
            "Lretrofit2/Response<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, Lretrofit2/KotlinExtensions$awaitResponse$2$2;->$continuation:Ldefpackage/az;

    .line 8
    .line 9
    invoke-interface {p0, p2}, Ldefpackage/vd0;->resumeWith(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
