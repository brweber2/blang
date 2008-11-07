module Interface

  class Signature
    attr_accessor :call_name, :arguments, :return_type
  end

  class Interface
    attr_accessor :signatures
  end
end