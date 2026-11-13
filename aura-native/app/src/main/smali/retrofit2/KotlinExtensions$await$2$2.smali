.class public final Lretrofit2/KotlinExtensions$await$2$2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lretrofit2/Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lretrofit2/KotlinExtensions;->await(Lretrofit2/Call;Ldefpackage/vd0;)Ljava/lang/Object;
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
    iput-object p1, p0, Lretrofit2/KotlinExtensions$await$2$2;->$continuation:Ldefpackage/az;

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
    iget-object p0, p0, Lretrofit2/KotlinExtensions$await$2$2;->$continuation:Ldefpackage/az;

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
    .locals 3
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
    invoke-virtual {p2}, Lretrofit2/Response;->isSuccessful()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    if-nez p2, :cond_0

    .line 18
    .line 19
    invoke-interface {p1}, Lretrofit2/Call;->request()Ldefpackage/oz3;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    const-class p2, Lretrofit2/Invocation;

    .line 27
    .line 28
    invoke-static {p2}, Ldefpackage/kx3;->a(Ljava/lang/Class;)Ldefpackage/i30;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    iget-object v0, p2, Ldefpackage/i30;->n:Ljava/lang/Class;

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    iget-object p1, p1, Ldefpackage/oz3;->e:Ljava/util/Map;

    .line 38
    .line 39
    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {v0, p1}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    check-cast p1, Lretrofit2/Invocation;

    .line 51
    .line 52
    invoke-virtual {p1}, Lretrofit2/Invocation;->service()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    invoke-virtual {p1}, Lretrofit2/Invocation;->method()Ljava/lang/reflect/Method;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    new-instance v0, Lkotlin/KotlinNullPointerException;

    .line 61
    .line 62
    new-instance v1, Ljava/lang/StringBuilder;

    .line 63
    .line 64
    const-string v2, "Response from "

    .line 65
    .line 66
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    const/16 p2, 0x2e

    .line 77
    .line 78
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    const-string p1, " was null but response body type was declared as non-null"

    .line 89
    .line 90
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-direct {v0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    iget-object p0, p0, Lretrofit2/KotlinExtensions$await$2$2;->$continuation:Ldefpackage/az;

    .line 101
    .line 102
    new-instance p1, Ldefpackage/s14;

    .line 103
    .line 104
    invoke-direct {p1, v0}, Ldefpackage/s14;-><init>(Ljava/lang/Throwable;)V

    .line 105
    .line 106
    .line 107
    invoke-interface {p0, p1}, Ldefpackage/vd0;->resumeWith(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    return-void

    .line 111
    :cond_0
    iget-object p0, p0, Lretrofit2/KotlinExtensions$await$2$2;->$continuation:Ldefpackage/az;

    .line 112
    .line 113
    invoke-interface {p0, p2}, Ldefpackage/vd0;->resumeWith(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    return-void

    .line 117
    :cond_1
    iget-object p0, p0, Lretrofit2/KotlinExtensions$await$2$2;->$continuation:Ldefpackage/az;

    .line 118
    .line 119
    new-instance p1, Lretrofit2/HttpException;

    .line 120
    .line 121
    invoke-direct {p1, p2}, Lretrofit2/HttpException;-><init>(Lretrofit2/Response;)V

    .line 122
    .line 123
    .line 124
    new-instance p2, Ldefpackage/s14;

    .line 125
    .line 126
    invoke-direct {p2, p1}, Ldefpackage/s14;-><init>(Ljava/lang/Throwable;)V

    .line 127
    .line 128
    .line 129
    invoke-interface {p0, p2}, Ldefpackage/vd0;->resumeWith(Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    return-void
.end method
