.class final Lretrofit2/HttpServiceMethod$CallAdapted;
.super Lretrofit2/HttpServiceMethod;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lretrofit2/HttpServiceMethod;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "CallAdapted"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ResponseT:",
        "Ljava/lang/Object;",
        "ReturnT:",
        "Ljava/lang/Object;",
        ">",
        "Lretrofit2/HttpServiceMethod<",
        "TResponseT;TReturnT;>;"
    }
.end annotation


# instance fields
.field private final callAdapter:Lretrofit2/CallAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lretrofit2/CallAdapter<",
            "TResponseT;TReturnT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lretrofit2/RequestFactory;Ldefpackage/fy;Lretrofit2/Converter;Lretrofit2/CallAdapter;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lretrofit2/RequestFactory;",
            "Ldefpackage/fy;",
            "Lretrofit2/Converter<",
            "Ldefpackage/n14;",
            "TResponseT;>;",
            "Lretrofit2/CallAdapter<",
            "TResponseT;TReturnT;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lretrofit2/HttpServiceMethod;-><init>(Lretrofit2/RequestFactory;Ldefpackage/fy;Lretrofit2/Converter;)V

    .line 2
    .line 3
    .line 4
    iput-object p4, p0, Lretrofit2/HttpServiceMethod$CallAdapted;->callAdapter:Lretrofit2/CallAdapter;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public adapt(Lretrofit2/Call;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lretrofit2/Call<",
            "TResponseT;>;[",
            "Ljava/lang/Object;",
            ")TReturnT;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lretrofit2/HttpServiceMethod$CallAdapted;->callAdapter:Lretrofit2/CallAdapter;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lretrofit2/CallAdapter;->adapt(Lretrofit2/Call;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
